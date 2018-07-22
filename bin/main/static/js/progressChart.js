$("#getData").click(function(){
	var seasonCode = $("#seasonValue").val();
	if(seasonCode === "" || seasonCode.length === 0){
		alert("Please select valid season value");
		return false;
	}
	var sucessDataPoints = [{x: 0, y:0}], errorDataPoints = [{x: 0, y:0}], pendingDataPoints=[{x: 0, y:0}];
	fillChart(sucessDataPoints, errorDataPoints, pendingDataPoints);
	
	var i =0, intervalId=0;
	var success= 0, failure=0, pending = 7458;
	
	intervalId = setInterval(function(){
		/**/
		var data = getData(seasonCode);
		console.log(data);
		/**/
		console.log(data);
		if(i>50){
			clearInterval(intervalId);
		} else {
			sucessDataPoints.push({
				x: i,
				y: success+1000
			});
			errorDataPoints.push({
				x: i,
				y: failure+20
			});
			pendingDataPoints.push({
				x: i,
				y: pending-40
			});
			success+=500;
			failure+=20;
			pending-=(success+failure);
			fillChart(sucessDataPoints, errorDataPoints, pendingDataPoints);
		}
		i += 10
	}, 10000);
	
});



var getData = function(seasonCode){
	var obj;
	$.ajax(
		{
		url: "http://localhost:8080/customs/"+seasonCode,
		async: false,
		dataType: "json"
	}).done(function(data){
		console.log(data);
		obj= data;
		console.log(obj);
	});
	
	
	
	
	return obj;
}

var fillChart = function(sucessDataPoints, errorDataPoints, pendingDataPoints) {
	var chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled : true,
		theme : "light2",
		title : {
			text : "Migration Status"
		},
		axisX : {
			suffix : " s",
			crosshair : {
				enabled : true,
				snapToDataPoint : true
			},
			title: "Time in Seconds",
			minimum : 0,
			interval: 1
		},
		axisY : {
			title : "Processed Data",
			crosshair : {
				enabled : true
			},
			interval: 500,
			maximum : 10000
		
		},
		toolTip : {
			shared : true
		},
		legend : {
			cursor : "pointer",
			verticalAlign : "top",
			horizontalAlign : "right",
			dockInsidePlotArea : false,
			itemclick : toogleDataSeries
		},
		data : [ {
			type : "line",
			showInLegend : true,
			name : "Success",
			markerType : "square",
			color : "#F08080",
			dataPoints : sucessDataPoints
		}, {
			type : "line",
			showInLegend : true,
			name : "Pending",
			lineDashType : "dash",
			dataPoints : pendingDataPoints
		}, {
			type : "line",
			showInLegend : true,
			name : "Failure",
			lineDashType : "dash",
			color : "#8080f0",
			dataPoints : errorDataPoints
		} ]
	});
	chart.render();

	function toogleDataSeries(e) {
		if (typeof (e.dataSeries.visible) === "undefined"
			|| e.dataSeries.visible) {
			e.dataSeries.visible = false;
		} else {
			e.dataSeries.visible = true;
		}
		chart.render();
	}

}
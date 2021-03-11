var localeModule = (function () {
	
	var saveLocale = function(){
		var comboValue = $('#selectLocale option:selected').val();
		$.ajax({
			type: "POST",
			async: true,
			data: JSON.stringify(),
			url: "http://localhost:8080/saveLocale?selectedLocale="+comboValue,
			success: function (response) {
				$("#mainContent").html(response);
			},
		});
	}

	return {
		saveLocale: saveLocale,
	}
	
})();

$("#saveLocale").click(function (e){
	localeModule.saveLocale();
})

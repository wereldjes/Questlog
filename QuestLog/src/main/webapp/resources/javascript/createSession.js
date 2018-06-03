$('.editSessionButton').on('click', function(event){
	event.preventDefault();
	var $clicked = $(this);
	$('.getSesID').val($clicked.data('id'));
	$('.getSessionName').val($clicked.data('name'));
});
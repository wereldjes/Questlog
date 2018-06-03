$('.editButton').on('click', function(event){
	event.preventDefault();
	var $clicked = $(this);
	$('.getAdvID').val($clicked.data('id'));
	$('.getAdvName').val($clicked.data('name'));
	$('.getMinLevel').val($clicked.data('minlevel'));
	$('.getMaxLevel').val($clicked.data('maxlevel'));
});
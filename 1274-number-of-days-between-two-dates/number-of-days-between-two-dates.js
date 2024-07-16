/**
 * @param {string} date1
 * @param {string} date2
 * @return {number}
 */
var daysBetweenDates = function(date1, date2) {
	const getDays = (date) => new Date(date) / 1000 / 60 / 60 / 24

	return Math.abs(getDays(date1) - getDays(date2))
};
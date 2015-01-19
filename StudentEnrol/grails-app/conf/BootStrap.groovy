import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

	def course1= new Course( 	title: 'Interactive Media with Animation',
					department: 'Computing',
					description: '"Lorem ipsum blah blah blaaah"',
					leader: 'Joe Bloggs',
					code: 'IMA101',
					startDate: new Date('19/01/2015'),
					endDate: new Date('19/01/2020'))

	if(!course1.save()) {
			course1.errors.allErrors.each{ error ->

		println "An error occured whilst creating course1: ${error}"

		}

	def course2= new Course( 	title: 'Architectures',
					department: 'ACES',
					description: '"Lorem ipsum blah blah blaaah"',
					leader: 'Dave Davidson',
					code: 'ARC202',
					startDate: new Date('01/01/2015'),
					endDate: new Date('15/01/2020'))

	if(!course2.save()) {
			course2.errors.allErrors.each{ error ->

		println "An error occured whilst creating course2: ${error}"

		}

}

	def destroy = {
    }
}


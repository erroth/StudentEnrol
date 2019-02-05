package com.enrol

class BootStrap {

    def init = { servletContext ->

	def computing=new Course (
		department:'Computing',
		courseTitle: 'BSc Hon Computing',
		courseLeader: 'Lynne Dawson',
		courseCode: 'B702',
		startDate: new Date('31/09/2017'),
		endDate: new Date('15/05/2021'),
		description: 'A bachelours in computing',
		numberOfStudents: 45,
		tuitionFees: 9250,
		).save()

def networking=new Course (
		department:'Computing',
		courseTitle: 'BSc Hon Computing (Networking)',
		courseLeader: 'Lynne Dawson',
		courseCode: 'B703',
		startDate: new Date('27/09/2017'),
		endDate: new Date('10/05/2021'),
		description: 'A bachelours in network computing',
		numberOfStudents: 21,
		tuitionFees: 9250,
		).save()

def geography=new Course (
		department:'Geography',
		courseTitle: 'BSc Hon Human Geography',
		courseLeader: 'Phoebe Lowe',
		courseCode: 'B507',
		startDate: new Date('23/09/2017'),
		endDate: new Date('18/05/2021'),
		description: 'A bachelours in Human Geography',
		numberOfStudents: 35,
		tuitionFees: 9250,
		).save()

def student1=new Student (
		studentName:'Leah Hale',
		studentID: 'b6009786',
		dob: new Date ('12/02/1997'),
		studentEmail: 'b6009786@my.shu.ac.uk',
		studentUsername:'b6009786',
		studentPassword: 'bracken97',
		isFundingAvailable: 'Yes',
		course: 'Computing',
		).save()

def student2=new Student (
		studentName:'Tom Handley',
		studentID: 'b7029763',
		dob: new Date ('10/09/1998'),
		studentEmail: 'b7029763@my.shu.ac.uk',
		studentUsername:'b7029763',
		studentPassword: 'sesh1234',
		isFundingAvailable: 'Yes',
		course: 'Computing',
		).save()

def Jackie=new Lecturer (
		fullName:'Jackie Stallard',
		post: 'Lecturer',
		subject: 'WADI',
		lecturerEmail: 'acesjas@my.shu.ac.uk',
		office:'9404',
		bio: 'The main lecturer of WADI. Fun and Bubbly',
		).save()

def Lynne=new Lecturer (
		fullName:'Lynne Dawson',
		post: 'Module Leader',
		subject: 'PPSP',
		lecturerEmail: 'acesld@my.shu.ac.uk',
		office:'9401',
		bio: 'The main lecturer of PPSP. Module leader of BSc Computing.',
		).save()

def sysarchs=new Module (
		module_title:'System Architecture',
		module_code: 'b702-65c',
		credits: 20,
		lecturer: 'Tondaroi',
		course: 'Computing',
		description:'Learning ubuntu and debian codes',
		).save()

def ppss=new Module (
		module_title:'Project Planning and Service Support',
		module_code: 'b702-64c',
		credits: 20,
		lecturer: 'Lynne Dawson',
		course: 'Computing',
		description:'Learning the uses of a service desk',
		).save()
    }
    def destroy = {
    }
}

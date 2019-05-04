package com.example.notekeeper

class CourseInfo(val courseId : String,val title: String)

class NoteInfo(var course: CourseInfo, val title: String, val text: String)
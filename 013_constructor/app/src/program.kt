package app.src
import app.src.entity.*

fun main (){
    println("---------------------------------------------------")
    println("Lat. Compiling Project Aplikasi : Ryan Ferdiansyah")
    println("---------------------------------------------------")

    // Membuat objek dari class 
    val teacher1 = Teacher("Lorem Ipsum", "Produktif RPL", "dummyMail@gmail.com\n")
    val teacher2 = Teacher("Lorem Ipsum", "Produktif RPL", "dummyMail@gmail.com\n")
    val teacher3 = Teacher("Lorem Ipsum", "Produktif RPL", "dummyMail@gmail.com\n")

    val student1 = Student("Lorem Ipsum", "Ini Kelas", "Ini alamat\n")
    val student2 = Student("Lorem Ipsum", "Ini Kelas", "Ini alamat\n")
    val student3 = Student("Lorem Ipsum", "Ini Kelas", "Ini alamat\n")
    
    // Memanggil Method 
    teacher1.teacherInfo()
    teacher2.teacherInfo()
    teacher3.teacherInfo()

    student1.studentInfo()
    student2.studentInfo()
    student3.studentInfo()
}
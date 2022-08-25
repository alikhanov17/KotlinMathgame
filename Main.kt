
import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()
    val  mathGame = MathGame()
    val linkedList = LinkedList<Rank>()

    var wh = 1
    var t = 0
    var x = 0
while (true){
    println("1-> start game:");
    println("2->  rating");
    println("3-> users ");
    println("4-> quit game")

    val a = scanner.nextInt();
    when(a){



    1->{

        System.out.println("enter name: ");
        val name = scanner.next();

        for (i in 0..4) {
            val num1 = random.nextInt(10)
            val num2 = random.nextInt(10)
            val amal = random.nextInt(4)
            println("$wh question")
            mathGame.Result(num1, num2, amal)
            val n = scanner.nextInt()
            if (n == mathGame.res) {
                t++
            } else {
                x++
            }
            wh++
        }
        wh=1
        linkedList.add( Rank(name, t, x))
        t=0
    x=0
    }
       2-> {

        for (r in linkedList) {
            println("name: " + r.name)
            println("right answers: " + r.t)
            println(" wrong answers: " + r.x)
        }
    }
    3->{

        linkedList.sortByDescending { it.t }
        linkedList.forEach{rank ->
            System.out.println(rank.name+" "+rank.t);
        }
    }
        4->{
            break
        }
        

    }

}}

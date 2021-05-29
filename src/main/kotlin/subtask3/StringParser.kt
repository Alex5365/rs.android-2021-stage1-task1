package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var mass: Array<String> = arrayOf()
        var str = ""
        var array: Array<String> = inputString.toCharArray().map { it.toString() }.toTypedArray()
        if(TestVlosh(array))
        {
            println("true")
            mass = run2(array)
        }
        else {
            println("false")
            while (Test(array)) {
                array = run(array)
                mass += array
                for (i in 0..array.size - 1) {
                    str += array[i]
                }
                println("str = $str")
                array = str.toCharArray().map { it.toString() }.toTypedArray()
                str = ""
            }
        }
        return mass

        throw NotImplementedError("Not implemented")
    }

    fun run(arr: Array<String>): Array<String> {
        var trigger = 0
        var mass: Array<String> = arrayOf()
        var str = ""

        for (i in 0..arr.size - 1) {
            if(arr[i] == "]" || arr[i] == ">" || arr[i] == ")")
            {
                if(trigger == 1)
                {
                    mass += str
                    str = ""
                }
                trigger--
            }
            if (trigger > 0)
            {
                str += arr[i]
            }
            if(arr[i] == "[" || arr[i] == "<" || arr[i] == "(")
            {
                trigger++
            }
        }
            return mass
    }

    fun Test(arr: Array<String>): Boolean {
        for (i in 0..arr.size - 1) {
            if (arr[i] == "[" || arr[i] == "<" || arr[i] == "(") {
                return true
                break
            }
        }
        return false
    }

    fun TestVlosh(arr: Array<String>): Boolean {
        var trig1: Int = 0
        var trig2: Int = 0
        var trig3: Int = 0
        for (i in 0..arr.size - 1) {
            if (arr[i] == "[" ) {
                trig1++
            }
            if (arr[i] == "<") {
                trig2++
            }
            if (arr[i] == "(") {
                trig3++
            }
            if(trig1 > 1 || trig2 > 1 || trig3 > 1)
            {
                return true
                break
            }
            if (arr[i] == "]" ) {
                trig1--
            }
            if (arr[i] == ">") {
                trig2--
            }
            if (arr[i] == ")") {
                trig3--
            }
        }
            return false
    }

    fun run2(arr: Array<String>): Array<String> {
        var trigger1 = 0
        var trigger2 = 0
        var trigger3 = 0
        var mass: Array<String> = arrayOf()
        var str1: Array<String> = arrayOf("", "", "", "", "", "", "", "")
        var str2: Array<String> = arrayOf("", "", "", "", "", "", "", "")
        var str3: Array<String> = arrayOf("", "", "", "", "", "", "", "")
        var q: Int = 0
        var w: Int = 0
        var e: Int = 0
        for (i in 0..arr.size - 1) {
            if (arr[i] == "]") {
                if (trigger1 == 1) {
                    e += 3
                }
                trigger1--

            }
            if (trigger1 == 1) {
                str1[e] += arr[i]
            }
            if (trigger1 == 2) {
                str1[e + 1] += arr[i]
                str1[e] += arr[i]
            }
            if (trigger1 == 3) {
                str1[e + 2] += arr[i]
                str1[e + 1] += arr[i]
                str1[e] += arr[i]
            }
            if (arr[i] == "[") {
                trigger1++
            }

            if (arr[i] == ">") {
                if (trigger2 == 1) {
                    w += 3
                }
                trigger2--

            }
            if (trigger2 == 1) {
                str2[w] += arr[i]
            }
            if (trigger2 == 2) {
                str2[w + 1] += arr[i]
                str2[w] += arr[i]
            }
            if (trigger2 == 3) {
                str2[w + 2] += arr[i]
                str2[w + 1] += arr[i]
                str2[w] += arr[i]
            }
            if (arr[i] == "<") {
                trigger2++
            }

            if (arr[i] == ")") {

                if (trigger3 == 1) {
                    q += 3
                }
                trigger3--
            }
            if (trigger3 == 1) {
                str3[q] += arr[i]
            }
            if (trigger3 == 2) {
                str3[q + 1] += arr[i]
                str3[q] += arr[i]
            }
            if (trigger3 == 3) {
                str3[q + 2] += arr[i]
                str3[q + 1] += arr[i]
                str3[q] += arr[i]
            }
            if (arr[i] == "(") {
                trigger3++
            }
        }

        for(i in 0..7)
        {
            if(str1[i] != "")
            {
                mass += str1[i]
            }

            if(str2[i] != "")
            {
                mass += str2[i]
            }

            if(str3[i] != "")
            {
                mass += str3[i]
            }
        }
        return mass
    }
}


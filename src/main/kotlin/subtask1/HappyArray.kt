package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size !== 0) {
            val x = sadArray.size - 1
            var mass: IntArray = sadArray

               while(PositivOpredelitel(mass))
               {
                   mass = convertMass(mass)
               }
            return  mass
        }
        else
        {
            return sadArray
        }
            throw NotImplementedError("Not implemented")
    }

    fun convertMass (Arr1: IntArray): IntArray
    {
        var Arr2: IntArray = intArrayOf()
        for (i in 0..Arr1.size - 1) {
            if (i > 0 && i < Arr1.size - 1) {
                if (Arr1[i] < Arr1[i - 1] + Arr1[i + 1]) {
                    Arr2 += Arr1[i]
                }
            } else {
                Arr2 += Arr1[i]
            }
        }
        return Arr2
    }

    fun PositivOpredelitel (Arr: IntArray): Boolean {
        for (i in 1..Arr.size - 2) {
                if (Arr[i] > Arr[i - 1] + Arr[i + 1])
                {
                    return true
                }
        }
        return false
    }
}

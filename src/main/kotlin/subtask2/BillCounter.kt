package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val bonAppetit = "bon appetit"
        if((bill.sum() - bill[k])/2 == b) {
            return bonAppetit
        }
        else
        {
            val x = b - (bill.sum() - bill[k])/2
            return x.toString()
        }
        throw NotImplementedError("Not implemented")
    }
}

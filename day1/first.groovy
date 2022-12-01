 println new File("input.txt").text.split("\n\n")
    .collect { group -> group.split("\n")
                             .collect { line -> line.toInteger() }
                             .inject(0, { sum, value -> sum + value })
    }
    .max()
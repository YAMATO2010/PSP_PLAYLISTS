
import java.io.File


run{
    try {

            if (args.isEmpty()) {

                println("使い方: kotlin <このスクリプトのパス> <ファイル名>")
        
                return@run
            }
            println("今から処理を始めます")
            if (!(args[0].endsWith(".m3u8") || args[0].endsWith(".txt"))) {

                return@run

            }

            val playLIst = File(args[0])
            val text: List<String> = playLIst.readLines()
            val outputTextlist = text.map { line ->

            val trimmed = line.trim('"')
            val converted = if (trimmed.startsWith("/MUSIC")) {

                trimmed
               
            } else {

                val noDrive = trimmed.replace(Regex("^[A-Z]:[\\\\¥]?"), "")
                "/" + noDrive.replace("\\", "/").replace("¥", "/")

            }
            println("処理中だお: $converted")
            converted 
            }
            val outputText = outputTextlist.joinToString("\n")
            println("変換は終わったお" + "<" + outputText + ">")
            if (args[0].endsWith(".m3u8")) {

                playLIst.writeText(outputText)

               
                println("かきこめたお")
            } else if (args[0].endsWith(".txt")) {
         
                    
               
                val Filename = playLIst.nameWithoutExtension
                val Filepath = playLIst.parent
                var newm3u8 = File(Filepath,Filename + ".m3u8")
            

                newm3u8.createNewFile()
                
                newm3u8.writeText(outputText)
           
                
                
                println("かきこめたお")   
            }
               
                return@run

            }catch (e: Exception){       
                println("エラーだお" + "\n" + e )         
                return@run
            }
        }

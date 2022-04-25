package com.codepalace.chatbot.utils

import com.codepalace.chatbot.utils.Constants.OPEN_GOOGLE
import com.codepalace.chatbot.utils.Constants.OPEN_SEARCH
import com.codepalace.chatbot.utils.Constants.OPEN_SEARCHYOUTOBE
import com.codepalace.chatbot.utils.Constants.OPEN_YOUTOBE
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message = _message.toLowerCase()

        return when {

            //hỏi and trả lời
            message.contains("Tds") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }
            message.contains("chào buổi sáng") -> {
                when (random) {
                    0 -> " Hi TSV, "
                    1 -> "chào bạn"
                    else -> "sáng gì nữa, 11h rồi  "
                }
            }
            message.contains("toi muon biet them ve truong") -> {
                when (random) {
                    0 -> " Hi TSV, "
                    1 -> "Truong nhieu thu ham lol lam"
                    else -> "toi cung khong biet gioi thieu nhu nao, nhung ma ban tu tu tim hieu di nha "
                }
            }
            message.contains("trường có nhiều gái xinh không") -> {
                when (random) {
                    0 -> " Hi TSV "
                    1 -> "Nhieu lam nhung ma toi cha quan tam, tại leo cao quá ngã đau "
                    else -> "toi cung khong biet gioi thieu nhu nao, nhung ma ban tu tu tim hieu di nha "
                }
            }
            message.contains("hello") -> {
                when (random) {
                    0 -> " Hi TSV, "
                    1 -> "Dạo này bạn khỏe không"
                    else -> "Nếu khỏe thì tốt rồi, chúc bạn học tập thật zuiii"
                }
            }
            message.contains("tại sao tôi không vào được web của trường") -> {
                when (random) {
                    0 -> " mình nghĩ là bạn nhập sai địa chỉ "
                    1 -> "Do số lượng snh viên truy cập quá tải nên bạn có thể load lại trang để thử vận may của mình nhé"
                    else -> "Do số lượng snh viên truy cập quá tải nên bạn có thể load lại trang để thử vận may của mình nhé"
                }
            }

            message.contains("trường tên gì vậy?") -> {
                when (random) {
                    0 -> "Đi ra cổng chính, có cái bảng tên trường to chà bá lữa kìa ông thần"
                    1 -> "tôi nghĩ bạn k phải sinh viên trường mình rồi  "
                    2 -> " Bạn hỏi câu nghe phát chán. Trường này tên Đại học Đông Á. Vậy cũng hỏi"
                    else -> " error"
                }

            }
            message.contains("sinh viên có được tốt nghiệp trước thời hạn không?") -> {
                when (random) {
                    0 -> "Nếu sinh viên tích lũy đủ số tín chỉ cần thiết, sinh viên sẽ được tốt nghiệp sớm. Mỗi năm Nhà trường có hai đợt xét tốt nghiệp nên sinh viên có thể tốt nghiệp sớm 1 học kỳ (6 tháng)."
                    1 -> "với bạn thì không được rồi :D"
                    else -> " error"
                }
            }
            message.contains("điều kiện để sinh viên tốt nghiệp sớm là như thế nào?") -> {
                when (random) {
                    0 -> "Để tốt nghiệp sớm sinh viên cần đăng ký học vượt theo thông báo của Nhà trường."
                    1 -> "Để tốt nghiệp sớm sinh viên cần đăng ký học vượt theo thông báo của Nhà trường."
                    else -> "Để tốt nghiệp sớm sinh viên cần đăng ký học vượt theo thông báo của Nhà trường."
                }
            }
            message.contains("!botngu") -> {
                when (random) {
                    0 -> "ngu cmm"
                    1 -> "ngu cmm"
                    else -> "ngu cmm"
                }
            }
            message.contains("!botdeptrai") -> {
                when (random) {
                    0 -> "hí hí, cảm ơn bạn nhó mãi yêu, i lớp diu chụt chụt <3 "
                    1 -> "tui là nữ nha, đẹp trai chổ nào ? "
                    else -> "tui là buê đuê"
                }
            }
            message.contains("điều kiện học cải thiện là như thế nào") -> {
                when (random) {
                    0 -> "Theo quy định, sinh viên được phép đăng ký học lại đối với các học phần bị điểm D để cải thiện điểm trung bình chung tích lũy. Không giải quyết cho sinh viên có điểm học phần đã đạt loại A, B, C đăng ký học lại để cải thiện điểm."
                    1 -> "Theo quy định, sinh viên được phép đăng ký học lại đối với các học phần bị điểm D để cải thiện điểm trung bình chung tích lũy. Không giải quyết cho sinh viên có điểm học phần đã đạt loại A, B, C đăng ký học lại để cải thiện điểm."
                    else -> " error"
                }
            }
            message.contains("sinh viên được mang những trang phục gì ? ") -> {
                when (random) {
                    0 -> "Theo quy định về trang phục được ban hành của Hiệu trưởng Trường Đại học Đông Á, sinh viên tuyệt đối không được mặc quần, váy cạp trễ kết hợp với áo ngắn hở người hoặc áo cổ quá trễ, váy quá ngắn hoặc quần, áo quá mỏng, không có tay, áo may ô, áo dây, quần short,…"
                    1 -> "Theo quy định về trang phục được ban hành của Hiệu trưởng Trường Đại học Đông Á, sinh viên tuyệt đối không được mặc quần, váy cạp trễ kết hợp với áo ngắn hở người hoặc áo cổ quá trễ, váy quá ngắn hoặc quần, áo quá mỏng, không có tay, áo may ô, áo dây, quần short,…"
                    else -> " error"
                }
            }
            message.contains("sinh viên có bắt buộc đeo thẻ không ? ") -> {
                when (random) {
                    0 -> "Tất cả sinh viên đều phải đeo thẻ sinh viên và xuất trình thẻ sinh viên mỗi khi vào trường nhằm quản lý việc ra vào cổng của viên chức, sinh viên, khách đến liên hệ công tác và đề phòng kẻ gian xâm nhập. Một khi không đeo thẻ, sinh viên sẽ không được phép vào trường. Sinh viên vi phạm sẽ bị lập Biên bản, trừ điểm rèn luyện hoặc bị xử lý theo quy định hiện hành.\n" +
                            "Lưu ý: Sinh viên không đeo thẻ sẽ không được dự thi kết thúc học phần (CMND hoặc các giấy tờ khác không có giá trị thay thế cho thẻ sinh viên)"
                    1 -> "không đeo thẻ thì bị phạt đó"
                    else -> " error"
                }
            }
            message.contains("sinh viên bị mất thẻ phải làm gì ? ") -> {
                when (random) {
                    0 -> "Nếu bị mất thẻ sinh viên thì liên hệ Ban CTCT&SV (Phòng 202, tầng 2) từ Thứ 2 đến Thứ 6 (giờ hành chính) để được cấp lại."
                    1 -> "Nếu bị mất thẻ sinh viên thì liên hệ Ban CTCT&SV (Phòng 202, tầng 2) từ Thứ 2 đến Thứ 6 (giờ hành chính) để được cấp lại."
                    else -> " error"
                }
            }


            //Open Google
            message.contains("open") && message.contains("google") -> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("tim kiem") -> {
                OPEN_SEARCH
            }
            message.contains("mo") && message.contains("youtobe") -> {
                OPEN_YOUTOBE
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "bot hơi ngu, mn thông cảm nha"
                    1 -> "hông biết nữa, ai biết gì đâu "
                    2 -> "cút, cho ăn chiếc dép bây giờ"
                    else -> "error"
                }
            }
        }
    }
}
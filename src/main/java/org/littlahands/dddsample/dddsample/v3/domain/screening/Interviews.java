package org.littlahands.dddsample.dddsample.v3.domain.screening;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Interviews {
  // Interviewの集合を内包する
  private List<InterviewV3> interviews;

  // コンストラクタの中でListの初期化を行う
  Interviews() {
    this.interviews = Collections.emptyList();
  }

  private Interviews(List<InterviewV3> interviews) {
    this.interviews = interviews;
  }

  static Interviews reconstruct(List<InterviewV3> interviews) {
    return new Interviews(interviews);
  }

  // 次の面接を追加する
  void addNextInterview(LocalDate interviewDate) {
    this.interviews.add(
        new InterviewV3(interviewDate, getNextInterviewNumber()));
  }

  // 次の面接次数を取得する
  private int getNextInterviewNumber() {
    // 面接次数は1からインクリメントされる
    return this.interviews.size() + 1;
  }
}

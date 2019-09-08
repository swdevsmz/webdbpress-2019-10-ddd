package org.littlahands.dddsample.dddsample.v4.domain.screening;

public interface ScreeningRepositoryV4 {
  ScreeningV4 findById(ScreeningId screeningId);
  void insert(ScreeningV4 screening);
  void update(ScreeningV4 screening);
}

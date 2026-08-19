package p817j$.util;

import java.util.Date;
import p817j$.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DesugarDate {
    public static Date from(Instant instant) {
        try {
            return new Date(instant.toEpochMilli());
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

package p817j$.util;

import java.util.Date;
import p817j$.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DateRetargetClass {
    public static Instant toInstant(Date date) {
        return Instant.ofEpochMilli(date.getTime());
    }
}

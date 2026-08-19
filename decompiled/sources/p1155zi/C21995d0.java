package p1155zi;

import java.util.List;
import kotlinx.serialization.KSerializer;
import p817j$.time.ZonedDateTime;
import p817j$.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: zi.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21995d0 {
    /* JADX INFO: renamed from: a */
    public static C21958S m22341a(C21999e0 c21999e0, EnumC21964U enumC21964U) {
        List list;
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        Object obj = null;
        if (c21999e0 == null || (list = c21999e0.f69630c) == null) {
            return null;
        }
        for (Object obj2 : list) {
            C21958S c21958s = (C21958S) obj2;
            if (c21958s.f69519a == enumC21964U && ZonedDateTime.parse(c21958s.f69520b, dateTimeFormatter).isAfter(zonedDateTimeNow)) {
                obj = obj2;
                break;
            }
        }
        return (C21958S) obj;
    }

    public final KSerializer serializer() {
        return C21991c0.f69623a;
    }
}

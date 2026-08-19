package p825j5;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: j5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16124a {

    /* JADX INFO: renamed from: a */
    public final Cursor f50035a;

    public C16124a(Cursor cursor, Long l4) {
        AbstractC16544l.m18094g(cursor, "cursor");
        this.f50035a = cursor;
        if (Build.VERSION.SDK_INT < 28 || l4 == null || !(cursor instanceof AbstractWindowedCursor)) {
            return;
        }
        AbstractC16131h.m17684a((AbstractWindowedCursor) cursor, l4.longValue());
    }

    /* JADX INFO: renamed from: a */
    public final String m17679a(int i10) {
        Cursor cursor = this.f50035a;
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}

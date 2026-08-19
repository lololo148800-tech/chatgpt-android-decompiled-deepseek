package p544W9;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import p328N1.AbstractC5579F;
import p328N1.C5578E;
import p328N1.C5608x;
import p571X9.AbstractC9382v4;
import p594Y9.AbstractC9918k3;

/* JADX INFO: renamed from: W9.W3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8578W3 {
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0034 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m9244a(p1014t1.C19748y r8, sm.AbstractC19685a r9) {
        /*
            boolean r0 = r9 instanceof p842k0.C16294c
            if (r0 == 0) goto L13
            r0 = r9
            k0.c r0 = (p842k0.C16294c) r0
            int r1 = r0.f50481o0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50481o0 = r1
            goto L18
        L13:
            k0.c r0 = new k0.c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f50480Z
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f50481o0
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t1.y r8 = r0.f50479Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            p571X9.AbstractC9233X.m9807c(r9)
        L34:
            r0.f50479Y = r8
            r0.f50481o0 = r3
            java.lang.Object r9 = p911o0.AbstractC17792x.m19522e(r8, r0)
            if (r9 != r1) goto L3f
            goto L6c
        L3f:
            t1.f r9 = (p1014t1.C19729f) r9
            int r2 = r9.f62462c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.lang.Object r9 = r9.f62460a
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r9.get(r5)
            t1.o r6 = (p1014t1.C19738o) r6
            boolean r7 = r6.m20692b()
            if (r7 != 0) goto L34
            boolean r7 = r6.f62485h
            if (r7 != 0) goto L34
            boolean r6 = r6.f62481d
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L4f
        L68:
            java.lang.Object r1 = r9.get(r4)
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p544W9.AbstractC8578W3.m9244a(t1.y, sm.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final Typeface m9245b(Typeface typeface, C5608x c5608x, Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return typeface;
        }
        ThreadLocal threadLocal = AbstractC5579F.f18082a;
        if (typeface == null) {
            return null;
        }
        ArrayList arrayList = c5608x.f18150a;
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = AbstractC5579F.f18082a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setTypeface(typeface);
        AbstractC9382v4.m9955a(context);
        paint.setFontVariationSettings(AbstractC9918k3.m10573a(arrayList, null, new C5578E(1), 31));
        return paint.getTypeface();
    }
}

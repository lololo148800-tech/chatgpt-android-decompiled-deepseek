package p350O1;

import android.view.inputmethod.CursorAnchorInfo;
import p204I1.C3578I;
import p204I1.C3599o;
import p759g1.C13801c;

/* JADX INFO: renamed from: O1.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6054c {
    /* JADX INFO: renamed from: a */
    public static final CursorAnchorInfo.Builder m6625a(CursorAnchorInfo.Builder builder, C3578I c3578i, C13801c c13801c) {
        int iM4311c;
        C3599o c3599o;
        int iM4311c2;
        if (!c13801c.m15323j() && (iM4311c = c3578i.f10893b.m4311c(c13801c.f43587b)) <= (iM4311c2 = (c3599o = c3578i.f10893b).m4311c(c13801c.f43589d))) {
            while (true) {
                builder.addVisibleLineBounds(c3578i.m4258h(iM4311c), c3599o.m4312d(iM4311c), c3578i.m4259i(iM4311c), c3599o.m4310b(iM4311c));
                if (iM4311c == iM4311c2) {
                    break;
                }
                iM4311c++;
            }
        }
        return builder;
    }
}

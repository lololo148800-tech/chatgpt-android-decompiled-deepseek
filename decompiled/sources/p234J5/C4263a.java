package p234J5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0654C;
import p033B5.AbstractC0833q;
import p1113xn.AbstractC21329w;
import p1155zi.C21907E;
import p374P5.C6361n;

/* JADX INFO: renamed from: J5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4263a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13926a;

    public /* synthetic */ C4263a(int i10) {
        this.f13926a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Object m5035a(Object obj, C6361n c6361n) {
        switch (this.f13926a) {
            case 0:
                return AbstractC0833q.m1896i(((Uri) obj).toString());
            case 1:
                return AbstractC0833q.m1888a(((File) obj).getPath());
            case 2:
                return AbstractC0833q.m1888a(((C0654C) obj).f1911Y.m1452r());
            case 3:
                Context context = c6361n.f20697a;
                int iIntValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return AbstractC0833q.m1896i("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                return AbstractC0833q.m1896i((String) obj);
            default:
                String data = (String) obj;
                AbstractC16544l.m18094g(data, "data");
                if (!AbstractC21329w.m21734u(data, "file-service://", false)) {
                    data = null;
                }
                if (data != null) {
                    return new C21907E(data);
                }
                return null;
        }
    }
}

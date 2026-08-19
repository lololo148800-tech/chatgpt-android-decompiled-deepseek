package p925oe;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p913o2.AbstractC17807h;

/* JADX INFO: renamed from: oe.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C18094T extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57729Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18095U f57730Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18094T(C18095U c18095u, int i10) {
        super(1);
        this.f57729Y = i10;
        this.f57730Z = c18095u;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object parcelableExtra;
        switch (this.f57729Y) {
            case 0:
                Intent intent = (Intent) obj;
                AbstractC16544l.m18094g(intent, "intent");
                C18095U c18095u = this.f57730Z;
                c18095u.getClass();
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (stringExtra != null && !AbstractC21322p.m21681O(stringExtra)) {
                    c18095u.f57735e = stringExtra;
                }
                break;
            case 1:
                Intent intent2 = (Intent) obj;
                AbstractC16544l.m18094g(intent2, "intent");
                C18095U c18095u2 = this.f57730Z;
                c18095u2.getClass();
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelableExtra = AbstractC17807h.m19565b(intent2, "android.intent.extra.STREAM", Uri.class);
                } else {
                    parcelableExtra = intent2.getParcelableExtra("android.intent.extra.STREAM");
                    if (!Uri.class.isInstance(parcelableExtra)) {
                        parcelableExtra = null;
                    }
                }
                Uri uri = (Uri) parcelableExtra;
                if (uri != null) {
                    c18095u2.m19712a(uri);
                }
                break;
            default:
                Intent intent3 = (Intent) obj;
                AbstractC16544l.m18094g(intent3, "intent");
                C18095U c18095u3 = this.f57730Z;
                c18095u3.getClass();
                ArrayList<Uri> arrayListM19564a = Build.VERSION.SDK_INT >= 34 ? AbstractC17807h.m19564a(intent3) : intent3.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (arrayListM19564a != null) {
                    for (Uri uri2 : arrayListM19564a) {
                        AbstractC16544l.m18091d(uri2);
                        c18095u3.m19712a(uri2);
                    }
                }
                break;
        }
        return C17296C.f55119a;
    }
}

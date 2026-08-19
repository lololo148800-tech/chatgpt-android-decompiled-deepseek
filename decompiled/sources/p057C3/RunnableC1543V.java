package p057C3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11846e;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import p083D3.C1868f;
import p1009s9.C19506i;
import p1139z0.C21585H;
import p133F3.C2658d;
import p221Ii.RunnableC3724c;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;
import p446S6.C7023b;
import p521V6.C7816i;

/* JADX INFO: renamed from: C3.V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1543V implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4222Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f4223Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f4224o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f4225p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f4226q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f4227r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f4228s0;

    public /* synthetic */ RunnableC1543V(C7816i c7816i, boolean z6, Context context, Uri uri, C11845d c11845d, C19506i c19506i) {
        this.f4222Y = 2;
        this.f4227r0 = c7816i;
        this.f4226q0 = z6;
        this.f4228s0 = context;
        this.f4223Z = uri;
        this.f4224o0 = c11845d;
        this.f4225p0 = c19506i;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [J3.C, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f4228s0;
        Object obj2 = this.f4224o0;
        Object obj3 = this.f4225p0;
        Object obj4 = this.f4223Z;
        Object obj5 = this.f4227r0;
        switch (this.f4222Y) {
            case 0:
                Pair pair = (Pair) obj;
                ((C1868f) ((C1546Y) ((C21585H) obj5).f68345o0).f4245i).mo2751I(((Integer) pair.first).intValue(), (C4253y) pair.second, (C4244p) obj4, (C4249u) obj2, (IOException) obj3, this.f4226q0);
                break;
            case 1:
                C2658d c2658d = (C2658d) obj5;
                int i10 = c2658d.f8168a;
                boolean z6 = this.f4226q0;
                this.f4228s0.mo2751I(i10, c2658d.f8169b, (C4244p) obj4, (C4249u) obj2, (IOException) obj3, z6);
                break;
            default:
                C7816i c7816i = (C7816i) obj5;
                c7816i.getClass();
                Context context = (Context) obj;
                Uri uri = (Uri) obj4;
                try {
                    if (this.f4226q0) {
                        c7816i.f24709f.m10861a(c7816i.f24710g.m8084c(context, uri));
                    } else {
                        c7816i.m8081c(context, uri);
                    }
                } catch (ActivityNotFoundException unused) {
                    AbstractC15256t.m16465c("i", "Could not find any Browser application installed in this device to handle the intent.");
                    return;
                } catch (SecurityException e10) {
                    C7023b c7023b = new C7023b("An error occurred when trying to authenticate with the server.", e10);
                    c7023b.f22454Y = "a0.browser_not_available";
                    c7023b.f22455Z = "Error launching browser for authentication";
                    ((C11846e) ((C11845d) obj2).f35976a).m13162a(new RunnableC3724c((C19506i) obj3, 21, c7023b));
                    return;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1543V(Object obj, Object obj2, C4244p c4244p, C4249u c4249u, IOException iOException, boolean z6, int i10) {
        this.f4222Y = i10;
        this.f4227r0 = obj;
        this.f4228s0 = obj2;
        this.f4223Z = c4244p;
        this.f4224o0 = c4249u;
        this.f4225p0 = iOException;
        this.f4226q0 = z6;
    }
}

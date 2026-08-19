package p1081wc;

import android.os.Handler;
import android.os.Looper;
import ci.C11759b;
import ci.RunnableC11758a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.EnumC21895B;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8215v5;

/* JADX INFO: renamed from: wc.U */
/* JADX INFO: loaded from: classes3.dex */
public final class C20874U implements InterfaceC20904w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11759b f66455a;

    public C20874U(C11759b c11759b) {
        this.f66455a = c11759b;
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: a */
    public final void mo21447a(AbstractC20892k event, Map properties) {
        AbstractC16544l.m18094g(event, "event");
        AbstractC16544l.m18094g(properties, "properties");
        C11759b c11759b = this.f66455a;
        if (c11759b != null) {
            String message = "Event " + event.f66564a + " was not tracked because no analytics provider was found.";
            AbstractC16544l.m18094g(message, "message");
            AbstractC8160o6.m8727b(c11759b.f35663d, message, null, 6);
            if (c11759b.f35661b != EnumC21895B.f69419Z) {
                new Handler(Looper.getMainLooper()).post(new RunnableC11758a(c11759b, message, 0));
            }
        }
    }

    @Override // p1081wc.InterfaceC20904w
    /* JADX INFO: renamed from: b */
    public final void mo21448b(AbstractC20892k abstractC20892k, Object obj, Map map) {
        AbstractC8215v5.m8845g(this, abstractC20892k, obj, map);
    }
}

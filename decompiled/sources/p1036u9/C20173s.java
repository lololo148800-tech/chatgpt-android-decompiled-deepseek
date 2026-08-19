package p1036u9;

import com.google.android.gms.common.api.internal.BasePendingResult;
import p1022t9.AbstractC19821f;
import p1022t9.AbstractC19824i;
import p377P9.HandlerC6378d;
import p960q9.C18653g;

/* JADX INFO: renamed from: u9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C20173s extends AbstractC19824i {

    /* JADX INFO: renamed from: b */
    public final AbstractC19821f f63899b;

    public C20173s(AbstractC19821f abstractC19821f) {
        this.f63899b = abstractC19821f;
    }

    /* JADX INFO: renamed from: a */
    public final C18653g m21007a(C18653g c18653g) {
        AbstractC19821f abstractC19821f = this.f63899b;
        abstractC19821f.getClass();
        boolean z6 = true;
        if (!c18653g.f36065i && !((Boolean) BasePendingResult.f36056j.get()).booleanValue()) {
            z6 = false;
        }
        c18653g.f36065i = z6;
        C20159e c20159e = abstractC19821f.f62883j;
        c20159e.getClass();
        C20177w c20177w = new C20177w(new C20180z(c18653g), c20159e.f63865u0.get(), abstractC19821f);
        HandlerC6378d handlerC6378d = c20159e.f63870z0;
        handlerC6378d.sendMessage(handlerC6378d.obtainMessage(4, c20177w));
        return c18653g;
    }
}

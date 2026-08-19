package vi;

import kotlin.jvm.internal.AbstractC16544l;
import p1043ui.AbstractC20298h;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p948pi.C18418a;
import sk.C19662a;

/* JADX INFO: renamed from: vi.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20621c extends AbstractC20298h {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC20621c(C20620b dependencies, String str, C19662a c19662a, Object obj) {
        AbstractC16544l.m18094g(dependencies, "dependencies");
        C18418a accountSession = dependencies.f65456c;
        AbstractC16544l.m18094g(accountSession, "accountSession");
        super(dependencies.f65454a, AbstractC17680n.m19349Y(AbstractC17681o.m19382k(accountSession.f58777e, str), "_", null, null, 0, null, null, 62), dependencies.f65455b, c19662a, obj);
        dependencies.f65457d.m19237b(new C20619a(this, null));
    }
}

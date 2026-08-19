package p460Sk;

import il.AbstractC15037b;
import il.C15038c;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.C15087m;
import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17285c;
import ml.AbstractC17286d;
import ml.AbstractC17287e;
import ml.AbstractC17288f;
import p025An.C0613g0;
import p025An.C0644w;
import p025An.InterfaceC0627n0;
import p480Te.C7390o;
import p857kl.C16440G;
import p857kl.C16460h;
import p857kl.InterfaceC16476x;

/* JADX INFO: renamed from: Sk.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7145b extends AbstractC17286d {

    /* JADX INFO: renamed from: a */
    public final AbstractC17288f f22722a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0627n0 f22723b;

    /* JADX INFO: renamed from: c */
    public final C7390o f22724c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15088n f22725d;

    public C7145b(AbstractC17288f delegate, InterfaceC0627n0 callContext, C7390o c7390o) {
        InterfaceC15088n interfaceC15088nMo7533e;
        AbstractC16544l.m18094g(delegate, "delegate");
        AbstractC16544l.m18094g(callContext, "callContext");
        this.f22722a = delegate;
        InterfaceC0627n0 interfaceC0627n0 = callContext;
        this.f22723b = interfaceC0627n0;
        this.f22724c = c7390o;
        if (delegate instanceof AbstractC17285c) {
            interfaceC15088nMo7533e = AbstractC15070F.m16173a(((AbstractC17285c) delegate).mo9568e());
        } else if (delegate instanceof C15038c) {
            InterfaceC15088n.f46873a.getClass();
            interfaceC15088nMo7533e = C15087m.f46872b;
        } else if (delegate instanceof AbstractC17286d) {
            interfaceC15088nMo7533e = ((AbstractC17286d) delegate).mo7533e();
        } else {
            if (!(delegate instanceof AbstractC17287e)) {
                throw new C0644w();
            }
            interfaceC15088nMo7533e = (C15085k) AbstractC15070F.m16193u(C0613g0.f1858Y, interfaceC0627n0, new C7144a(delegate, null)).f34001Z;
        }
        this.f22725d = interfaceC15088nMo7533e;
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: a */
    public final Long mo7529a() {
        return this.f22722a.mo7529a();
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: b */
    public final C16460h mo7530b() {
        return this.f22722a.mo7530b();
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: c */
    public final InterfaceC16476x mo7531c() {
        return this.f22722a.mo7531c();
    }

    @Override // ml.AbstractC17288f
    /* JADX INFO: renamed from: d */
    public final C16440G mo7532d() {
        return this.f22722a.mo7532d();
    }

    @Override // ml.AbstractC17286d
    /* JADX INFO: renamed from: e */
    public final InterfaceC15088n mo7533e() {
        return AbstractC15037b.m16169a(this.f22725d, this.f22723b, this.f22722a.mo7529a(), this.f22724c);
    }
}

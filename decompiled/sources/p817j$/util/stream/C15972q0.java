package p817j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.q0 */
/* JADX INFO: loaded from: classes4.dex */
final class C15972q0 extends AbstractC15992u0 {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ EnumC15997v0 f49385c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Predicate f49386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15972q0(EnumC15997v0 enumC15997v0, Predicate predicate) {
        super(enumC15997v0);
        this.f49385c = enumC15997v0;
        this.f49386d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f49410a) {
            return;
        }
        boolean zTest = this.f49386d.test(obj);
        EnumC15997v0 enumC15997v0 = this.f49385c;
        if (zTest == enumC15997v0.f49417a) {
            this.f49410a = true;
            this.f49411b = enumC15997v0.f49418b;
        }
    }
}

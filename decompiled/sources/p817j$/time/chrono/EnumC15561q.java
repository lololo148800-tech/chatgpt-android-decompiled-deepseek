package p817j$.time.chrono;

import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.q */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15561q implements InterfaceC15556l {

    /* JADX INFO: renamed from: AH */
    public static final EnumC15561q f48592AH;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15561q[] f48593a;

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16957i(this, interfaceC15635o);
    }

    @Override // p817j$.time.chrono.InterfaceC15556l
    public final int getValue() {
        return 1;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16953e(this, (EnumC15621a) interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long mo16773u(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16954f(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object mo16774y(TemporalQuery temporalQuery) {
        return AbstractC15551g.m16961m(this, temporalQuery);
    }

    public static EnumC15561q valueOf(String str) {
        return (EnumC15561q) Enum.valueOf(EnumC15561q.class, str);
    }

    public static EnumC15561q[] values() {
        return (EnumC15561q[]) f48593a.clone();
    }

    static {
        EnumC15561q enumC15561q = new EnumC15561q("AH", 0);
        f48592AH = enumC15561q;
        f48593a = new EnumC15561q[]{enumC15561q};
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.ERA) {
            return C15637q.m17168j(1L, 1L);
        }
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(1, EnumC15621a.ERA);
    }
}

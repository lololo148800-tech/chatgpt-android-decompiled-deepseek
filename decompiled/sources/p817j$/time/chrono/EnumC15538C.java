package p817j$.time.chrono;

import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.C */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15538C implements InterfaceC15556l {
    public static final EnumC15538C BEFORE_ROC;
    public static final EnumC15538C ROC;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15538C[] f48548a;

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16957i(this, interfaceC15635o);
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

    public static EnumC15538C valueOf(String str) {
        return (EnumC15538C) Enum.valueOf(EnumC15538C.class, str);
    }

    public static EnumC15538C[] values() {
        return (EnumC15538C[]) f48548a.clone();
    }

    static {
        EnumC15538C enumC15538C = new EnumC15538C("BEFORE_ROC", 0);
        BEFORE_ROC = enumC15538C;
        EnumC15538C enumC15538C2 = new EnumC15538C("ROC", 1);
        ROC = enumC15538C2;
        f48548a = new EnumC15538C[]{enumC15538C, enumC15538C2};
    }

    @Override // p817j$.time.chrono.InterfaceC15556l
    public final int getValue() {
        return ordinal();
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(getValue(), EnumC15621a.ERA);
    }
}

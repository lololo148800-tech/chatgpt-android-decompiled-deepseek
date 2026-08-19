package p817j$.time.chrono;

import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.chrono.I */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15544I implements InterfaceC15556l {

    /* JADX INFO: renamed from: BE */
    public static final EnumC15544I f48555BE;
    public static final EnumC15544I BEFORE_BE;

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ EnumC15544I[] f48556a;

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

    public static EnumC15544I valueOf(String str) {
        return (EnumC15544I) Enum.valueOf(EnumC15544I.class, str);
    }

    public static EnumC15544I[] values() {
        return (EnumC15544I[]) f48556a.clone();
    }

    static {
        EnumC15544I enumC15544I = new EnumC15544I("BEFORE_BE", 0);
        BEFORE_BE = enumC15544I;
        EnumC15544I enumC15544I2 = new EnumC15544I("BE", 1);
        f48555BE = enumC15544I2;
        f48556a = new EnumC15544I[]{enumC15544I, enumC15544I2};
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

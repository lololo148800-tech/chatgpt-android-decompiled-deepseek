package p817j$.time.temporal;

/* JADX INFO: renamed from: j$.time.temporal.m */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15633m implements TemporalAdjuster {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48781b;

    public /* synthetic */ C15633m(int i10, int i11) {
        this.f48780a = i11;
        this.f48781b = i10;
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        switch (this.f48780a) {
            case 0:
                int iMo16771o = temporal.mo16771o(EnumC15621a.DAY_OF_WEEK);
                int i10 = this.f48781b;
                if (iMo16771o == i10) {
                    return temporal;
                }
                int i11 = iMo16771o - i10;
                return temporal.mo16788e(i11 >= 0 ? 7 - i11 : -i11, ChronoUnit.DAYS);
            default:
                int iMo16771o2 = temporal.mo16771o(EnumC15621a.DAY_OF_WEEK);
                int i12 = this.f48781b;
                if (iMo16771o2 == i12) {
                    return temporal;
                }
                int i13 = i12 - iMo16771o2;
                return temporal.mo16789m(i13 >= 0 ? 7 - i13 : -i13, ChronoUnit.DAYS);
        }
    }
}

package p324Mn;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p817j$.time.format.DateTimeFormatterBuilder;

/* JADX INFO: renamed from: Mn.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5529J extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C5529J f17979Z = new C5529J(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5529J f17980o0 = new C5529J(0, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5529J f17981p0 = new C5529J(0, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17982Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5529J(int i10, int i11) {
        super(i10);
        this.f17982Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f17982Y) {
            case 0:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 1:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }
}

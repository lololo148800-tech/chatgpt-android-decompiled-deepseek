package p998rp;

/* JADX INFO: renamed from: rp.e */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC19266e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f61069Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f61070Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f61071o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19268g f61072p0;

    public RunnableC19266e(AbstractC19268g abstractC19268g, long j10, long j11, long j12) {
        this.f61072p0 = abstractC19268g;
        this.f61069Y = j10;
        this.f61070Z = j11;
        this.f61071o0 = j12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC19268g abstractC19268g = this.f61072p0;
        int iOrdinal = abstractC19268g.f61076Y.ordinal();
        long j10 = this.f61071o0;
        long j11 = this.f61070Z;
        long j12 = this.f61069Y;
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 10:
            case 11:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putByte((abstractC19268g.f61078o0 * j12) + j10, (byte) 0);
                    j12++;
                }
                return;
            case 3:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putShort((abstractC19268g.f61078o0 * j12) + j10, (short) 0);
                    j12++;
                }
                return;
            case 4:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putInt((abstractC19268g.f61078o0 * j12) + j10, 0);
                    j12++;
                }
                return;
            case 5:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putLong((abstractC19268g.f61078o0 * j12) + j10, 0L);
                    j12++;
                }
                return;
            case 6:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putFloat((abstractC19268g.f61078o0 * j12) + j10, 0.0f);
                    j12++;
                }
                return;
            case 7:
                while (j12 < j11) {
                    AbstractC19279r.f61085a.putDouble((abstractC19268g.f61078o0 * j12) + j10, 0.0d);
                    j12++;
                }
                return;
            case 8:
            case 9:
            default:
                throw new IllegalArgumentException("Invalid array type.");
        }
    }
}

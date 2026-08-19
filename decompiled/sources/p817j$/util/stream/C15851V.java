package p817j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p817j$.util.C16025w;
import p817j$.util.C16027y;
import p817j$.util.function.BiConsumer$CC;
import p817j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15851V implements ToIntFunction, IntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49195a;

    public /* synthetic */ C15851V(int i10) {
        this.f49195a = i10;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    /* JADX INFO: renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0 */
    private final void m17433x10ce6cf0(Object obj) {
    }

    /* JADX INFO: renamed from: accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1 */
    private final void m17434x10ce6cf1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i10 = this.f49195a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f49195a) {
            case 4:
                break;
            case 8:
                break;
            case 12:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f49195a) {
            case 19:
                break;
            case 25:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        return Long.valueOf(j10);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i10, int i11) {
        switch (this.f49195a) {
            case 2:
                return Math.min(i10, i11);
            case 5:
                return i10 + i11;
            default:
                return Math.max(i10, i11);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j10, long j11) {
        switch (this.f49195a) {
            case 10:
                return Math.min(j10, j11);
            case 17:
                return Math.max(j10, j11);
            default:
                return j10 + j11;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i10) {
        switch (this.f49195a) {
            case 1:
                return Integer.valueOf(i10);
            case 13:
                return new Long[i10];
            case 20:
                return new Object[i10];
            case 21:
                return new Object[i10];
            case 22:
                return new Integer[i10];
            case 23:
                return new Long[i10];
            case 24:
                return new Double[i10];
            case 27:
                return new Integer[i10];
            case 28:
                return new Integer[i10];
            default:
                return new Long[i10];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j10) {
        switch (this.f49195a) {
            case 9:
                ((C16027y) obj).accept(j10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j10;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f49195a) {
            case 4:
                ((C16025w) obj).m17582b((C16025w) obj2);
                break;
            case 8:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 12:
                ((C16027y) obj).m17583b((C16027y) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i10) {
        switch (this.f49195a) {
            case 3:
                ((C16025w) obj).accept(i10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i10);
                break;
        }
    }
}

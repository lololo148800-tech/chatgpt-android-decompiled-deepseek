package coil3.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p059C5.InterfaceC1589g;
import p374P5.C6363p;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"coil3/compose/AsyncImagePainter$State$Success", "LC5/g;", "Lm1/a;", "painter", "Lm1/a;", "a", "()Lm1/a;", "coil-compose-core_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AsyncImagePainter$State$Success implements InterfaceC1589g {

    /* JADX INFO: renamed from: a */
    public final C6363p f35917a;
    private final AbstractC17140a painter;

    public AsyncImagePainter$State$Success(AbstractC17140a abstractC17140a, C6363p c6363p) {
        this.painter = abstractC17140a;
        this.f35917a = c6363p;
    }

    @Override // p059C5.InterfaceC1589g
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Success)) {
            return false;
        }
        AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
        return AbstractC16544l.m18089b(this.painter, asyncImagePainter$State$Success.painter) && AbstractC16544l.m18089b(this.f35917a, asyncImagePainter$State$Success.f35917a);
    }

    public final int hashCode() {
        return this.f35917a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.f35917a + ')';
    }
}

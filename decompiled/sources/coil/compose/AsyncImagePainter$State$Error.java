package coil.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1075w5.C20827e;
import p882m1.AbstractC17140a;
import p886m5.AbstractC17167b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"coil/compose/AsyncImagePainter$State$Error", "Lm5/b;", "Lm1/a;", "painter", "Lm1/a;", "a", "()Lm1/a;", "coil-compose-base_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class AsyncImagePainter$State$Error extends AbstractC17167b {

    /* JADX INFO: renamed from: a */
    public final C20827e f35887a;
    private final AbstractC17140a painter;

    public AsyncImagePainter$State$Error(AbstractC17140a abstractC17140a, C20827e c20827e) {
        this.painter = abstractC17140a;
        this.f35887a = c20827e;
    }

    @Override // p886m5.AbstractC17167b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return AbstractC16544l.m18089b(this.painter, asyncImagePainter$State$Error.painter) && AbstractC16544l.m18089b(this.f35887a, asyncImagePainter$State$Error.f35887a);
    }

    public final int hashCode() {
        AbstractC17140a abstractC17140a = this.painter;
        return this.f35887a.hashCode() + ((abstractC17140a == null ? 0 : abstractC17140a.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.f35887a + ')';
    }
}

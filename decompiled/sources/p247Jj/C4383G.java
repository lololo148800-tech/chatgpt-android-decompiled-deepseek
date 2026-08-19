package p247Jj;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Jj.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C4383G extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public static final C4383G f14251a = new C4383G();

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String strMo12820x = "";
        while (reader.hasNext()) {
            if (AbstractC16544l.m18089b(reader.mo12813a0(), "type")) {
                strMo12820x = reader.mo12820x();
                AbstractC16544l.m18093f(strMo12820x, "nextString(...)");
            } else {
                reader.mo12800D();
            }
        }
        reader.mo12818m();
        return new C4381F(strMo12820x);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        AbstractC4385H abstractC4385H = (AbstractC4385H) obj;
        AbstractC16544l.m18094g(writer, "writer");
        writer.mo12833e();
        writer.mo12827T("type");
        writer.mo12828V0(abstractC4385H != null ? abstractC4385H.getF40675Z() : null);
        writer.mo12823E();
    }
}

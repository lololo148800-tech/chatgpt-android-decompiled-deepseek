package p857kl;

import android.gov.nist.core.Separators;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16458f {

    /* JADX INFO: renamed from: a */
    public static final C16460h f51062a;

    static {
        C17689w c17689w = C17689w.f56480Y;
        new C16460h("multipart", Separators.STAR, c17689w);
        new C16460h("multipart", "mixed", c17689w);
        new C16460h("multipart", "alternative", c17689w);
        new C16460h("multipart", "related", c17689w);
        f51062a = new C16460h("multipart", "form-data", c17689w);
        new C16460h("multipart", "signed", c17689w);
        new C16460h("multipart", "encrypted", c17689w);
        new C16460h("multipart", "byteranges", c17689w);
    }
}

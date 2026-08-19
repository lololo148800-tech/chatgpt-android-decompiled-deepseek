package p571X9;

import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p092Dc.C1991h;
import p1155zi.AbstractC21933K1;
import p1155zi.C21937L1;
import p1155zi.C21949O1;
import p1155zi.EnumC21895B;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p919o8.C17977i;

/* JADX INFO: renamed from: X9.W3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9231W3 {
    /* JADX INFO: renamed from: a */
    public static C17977i m9803a(C3676s c3676s) {
        try {
            Number sessionSampleRate = c3676s.m4395w("session_sample_rate").mo4383q();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("session_replay_sample_rate");
            Number numberMo4383q = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4383q() : null;
            AbstractC16544l.m18093f(sessionSampleRate, "sessionSampleRate");
            return new C17977i(sessionSampleRate, numberMo4383q);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Configuration", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Configuration", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Configuration", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m9804b(AbstractC21933K1 abstractC21933K1, C1991h resolver, EnumC21895B appType) {
        AbstractC16544l.m18094g(abstractC21933K1, "<this>");
        AbstractC16544l.m18094g(resolver, "resolver");
        AbstractC16544l.m18094g(appType, "appType");
        if (appType != EnumC21895B.f69419Z) {
            return abstractC21933K1.f69485a.toString();
        }
        if (abstractC21933K1 instanceof C21937L1) {
            return resolver.m3160b(R.string.design_error_network);
        }
        if (!(abstractC21933K1 instanceof C21949O1)) {
            return resolver.m3160b(R.string.design_error_generic);
        }
        C21949O1 c21949o1 = (C21949O1) abstractC21933K1;
        String str = c21949o1.f69507c;
        Integer num = c21949o1.f69506b;
        if (num != null && num.intValue() >= 500) {
            return resolver.m3161c(R.string.design_error_server, str);
        }
        String str2 = c21949o1.f69508d;
        if (str2 == null || str2.length() <= 0) {
            return (num != null && num.intValue() == 429) ? resolver.m3161c(R.string.design_error_rate_limit, str) : resolver.m3161c(R.string.design_error_service, str);
        }
        return str2;
    }
}

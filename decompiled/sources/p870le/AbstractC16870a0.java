package p870le;

import java.util.List;
import java.util.Set;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p269Kh.C4697x;
import p269Kh.C4699z;
import p269Kh.EnumC4672A;
import p269Kh.EnumC4694u;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;
import p909nm.C17691y;

/* JADX INFO: renamed from: le.a0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16870a0 {

    /* JADX INFO: renamed from: a */
    public static final C4676c f54144a;

    static {
        List listM9974d = AbstractC9393x3.m9974d("gpt3.5");
        C17691y c17691y = C17691y.f56482Y;
        C4688o c4688o = new C4688o("gpt_3.5", "text-davinci-002-render-sha", "Default (GPT-3.5)", "Our fastest model, great for most everyday tasks.", listM9974d, (Integer) 8191, (Set) c17691y, new C4699z(null));
        List listM9974d2 = AbstractC9393x3.m9974d("gpt4");
        EnumC4694u enumC4694u = EnumC4694u.f15268Y;
        C4688o c4688o2 = new C4688o("gpt_4", "gpt-4", "GPT-4 (All Tools)", "Browsing, Advanced Data Analysis, and DALL·E are now built into GPT-4", listM9974d2, (Integer) 32767, new C4699z(new C4697x(enumC4694u, AbstractC17681o.m19382k("application/pdf", "text/plain"), true)), 64);
        C4688o c4688o3 = new C4688o("gpt_3.5", "gpt-4o-mini", "GPT-4o mini", "Browsing, Advanced Data Analysis, and DALL·E are now built into GPT-4", AbstractC17681o.m19382k("gpt4o", "gpt4", "gpt3.5"), (Integer) 32767, new C4699z(new C4697x(enumC4694u, AbstractC17681o.m19382k("application/pdf", "text/plain"), true)), 64);
        C4688o c4688o4 = new C4688o("gpt_4o_canmore", "gpt-4o-canmore", "GPT-4o Canvas", "Newest and most advanced model", AbstractC17681o.m19382k("gpt4o", "gpt4"), (Integer) 32767, new C4699z(new C4697x(enumC4694u, AbstractC17681o.m19382k("application/pdf", "text/plain"), true)), 64);
        C4688o c4688o5 = new C4688o("gpt_4o", "gpt-4o", "GPT-4o", "Newest and most advanced model", AbstractC17681o.m19382k("gpt4o", "gpt4"), (Integer) 32767, new C4699z(new C4697x(enumC4694u, AbstractC17681o.m19382k("application/pdf", "text/plain"), true)), 64);
        C4688o c4688o6 = new C4688o("o1", "o1-preview", "o1-preview", "Our most capable model, great for tasks that require creativity and advanced reasoning.", AbstractC9393x3.m9974d("o1"), (Integer) 57768, (Set) c17691y, new C4699z(null));
        C4688o c4688o7 = new C4688o("o1_mini", "o1-mini", "o1-mini", "Our most capable model, great for tasks that require creativity and advanced reasoning.", AbstractC9393x3.m9974d("o1"), (Integer) 98304, (Set) c17691y, new C4699z(null));
        EnumC4672A enumC4672A = EnumC4672A.f15214Z;
        f54144a = new C4676c(AbstractC17681o.m19382k(new C4679f(new C4684k("gpt_4", "GPT-4", "4", "The OG Chatbbyg", enumC4672A, "gpt-4", (String) null, (String) null, (String) null, (String) null, (String) null, "star", false, (List) null, 10176), AbstractC9393x3.m9974d(c4688o2), c4688o2), new C4679f(new C4684k("gpt_3.5", "GPT-4o mini", "4o mini", "Small but mighty", EnumC4672A.f15213Y, "gpt-4o-mini", (String) null, (String) null, (String) null, (String) null, (String) null, "bolt", false, (List) null, 10176), AbstractC17681o.m19382k(c4688o3, c4688o), c4688o3), new C4679f(new C4684k("o1_mini", "o1-mini", "o1-mini", "Less smart but still dang smart", enumC4672A, "o1-mini", (String) null, (String) null, (String) null, (String) null, (String) null, "reasoning_mini", false, (List) null, 10176), AbstractC9393x3.m9974d(c4688o7), c4688o7), new C4679f(new C4684k("o1", "o1-preview", "o1-preview", "Really smart", enumC4672A, "o1-preview", (String) null, (String) null, (String) null, (String) null, (String) null, "reasoning", false, (List) null, 10176), AbstractC9393x3.m9974d(c4688o6), c4688o6), new C4679f(new C4684k("9fdGgEgJ", "GPT-4o with canvas", "4o with canvas", (String) null, enumC4672A, "gpt-4o-canmore", (String) null, (String) null, (String) null, (String) null, (String) null, "stars", false, (List) null, 10184), AbstractC9393x3.m9974d(c4688o4), c4688o4), new C4679f(new C4684k("AG8PqS2q", "GPT-4o", "4o", (String) null, enumC4672A, "gpt-4o", (String) null, (String) null, (String) null, (String) null, (String) null, "stars", false, (List) null, 10184), AbstractC9393x3.m9974d(c4688o5), c4688o5)), "gpt-4o");
    }
}

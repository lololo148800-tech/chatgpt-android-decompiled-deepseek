package p149Fj;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse$IdClassesForCountry;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$SupplementaryData;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0593T;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1156zj.AbstractC22200v;
import p1156zj.C22130W0;
import p1156zj.C22134Y0;
import p1156zj.InterfaceC22096F;
import p604Yk.C10077b;
import p729ej.InterfaceC13427r;
import p856kk.C16433a;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Fj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C2878l implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f8649b;

    /* JADX INFO: renamed from: c */
    public final String f8650c;

    /* JADX INFO: renamed from: d */
    public final String f8651d;

    /* JADX INFO: renamed from: e */
    public final String f8652e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2881o f8653f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC22096F f8654g;

    /* JADX INFO: renamed from: h */
    public final C16433a f8655h;

    /* JADX INFO: renamed from: i */
    public final AutoClassifyWorker$SupplementaryData f8656i;

    /* JADX INFO: renamed from: j */
    public final long f8657j;

    /* JADX INFO: renamed from: k */
    public final boolean f8658k;

    /* JADX INFO: renamed from: l */
    public final C10077b f8659l;

    public C2878l(String sessionToken, String inquiryId, String fromStep, String fromComponent, InterfaceC2881o service, InterfaceC22096F interfaceC22096F, C16433a imageHelper, AutoClassifyWorker$SupplementaryData autoClassifyWorker$SupplementaryData, long j10, boolean z6) {
        AbstractC16544l.m18094g(sessionToken, "sessionToken");
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        AbstractC16544l.m18094g(fromStep, "fromStep");
        AbstractC16544l.m18094g(fromComponent, "fromComponent");
        AbstractC16544l.m18094g(service, "service");
        AbstractC16544l.m18094g(imageHelper, "imageHelper");
        this.f8649b = sessionToken;
        this.f8650c = inquiryId;
        this.f8651d = fromStep;
        this.f8652e = fromComponent;
        this.f8653f = service;
        this.f8654g = interfaceC22096F;
        this.f8655h = imageHelper;
        this.f8656i = autoClassifyWorker$SupplementaryData;
        this.f8657j = j10;
        this.f8658k = z6;
        this.f8659l = new C10077b(17);
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m3718b(C2878l c2878l, List list) {
        String str;
        c2878l.getClass();
        List<AutoClassifyResponse$IdClassesForCountry> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
        for (AutoClassifyResponse$IdClassesForCountry autoClassifyResponse$IdClassesForCountry : list2) {
            String str2 = autoClassifyResponse$IdClassesForCountry.f40623Y;
            List list3 = autoClassifyResponse$IdClassesForCountry.f40625o0;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list3.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = autoClassifyResponse$IdClassesForCountry.f40624Z;
                if (zHasNext) {
                    C22130W0 c22130w0M22400b = AbstractC22200v.m22400b((C12893Id) it.next(), str, c2878l.f8657j);
                    if (c22130w0M22400b != null) {
                        arrayList2.add(c22130w0M22400b);
                    }
                }
            }
            arrayList.add(new C22134Y0(str2, str, arrayList2));
        }
        return arrayList;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C2878l) {
            if (AbstractC16544l.m18089b(this.f8649b, ((C2878l) otherWorker).f8649b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return AbstractC2124C.m3224w(new C2219z0(new C2877k(this, null)), AbstractC0593T.f1824a);
    }
}

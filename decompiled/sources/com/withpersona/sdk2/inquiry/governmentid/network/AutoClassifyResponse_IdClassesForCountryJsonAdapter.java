package com.withpersona.sdk2.inquiry.governmentid.network;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse_IdClassesForCountryJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdClassesForCountry;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AutoClassifyResponse_IdClassesForCountryJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40632a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40633b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40634c;

    public AutoClassifyResponse_IdClassesForCountryJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40632a = C11475v.m12866a("countryName", "countryCode", "idConfigs");
        C17691y c17691y = C17691y.f56482Y;
        this.f40633b = moshi.m12850b(String.class, c17691y, "countryName");
        this.f40634c = moshi.m12850b(AbstractC11452Q.m12856f(List.class, C12893Id.class), c17691y, "idConfigs");
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        AutoClassifyResponse$IdClassesForCountry autoClassifyResponse$IdClassesForCountry = (AutoClassifyResponse$IdClassesForCountry) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (autoClassifyResponse$IdClassesForCountry == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("countryName");
        AbstractC11471r abstractC11471r = this.f40633b;
        abstractC11471r.toJson(writer, autoClassifyResponse$IdClassesForCountry.f40623Y);
        writer.mo12827T("countryCode");
        abstractC11471r.toJson(writer, autoClassifyResponse$IdClassesForCountry.f40624Z);
        writer.mo12827T("idConfigs");
        this.f40634c.toJson(writer, autoClassifyResponse$IdClassesForCountry.f40625o0);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(62, "GeneratedJsonAdapter(AutoClassifyResponse.IdClassesForCountry)", "StringBuilder(capacity).…builderAction).toString()");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        String str2 = null;
        List list = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str3 = qffLJgOYizGmMj.egvGUn;
            if (!zHasNext) {
                reader.mo12818m();
                if (str == null) {
                    throw AbstractC13178c.m14832f(str3, str3, reader);
                }
                if (str2 == null) {
                    throw AbstractC13178c.m14832f("countryCode", "countryCode", reader);
                }
                if (list != null) {
                    return new AutoClassifyResponse$IdClassesForCountry(str, str2, list);
                }
                throw AbstractC13178c.m14832f("idConfigs", "idConfigs", reader);
            }
            int iMo12819v0 = reader.mo12819v0(this.f40632a);
            if (iMo12819v0 != -1) {
                AbstractC11471r abstractC11471r = this.f40633b;
                if (iMo12819v0 == 0) {
                    str = (String) abstractC11471r.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l(str3, str3, reader);
                    }
                } else if (iMo12819v0 == 1) {
                    str2 = (String) abstractC11471r.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("countryCode", "countryCode", reader);
                    }
                } else if (iMo12819v0 == 2 && (list = (List) this.f40634c.fromJson(reader)) == null) {
                    throw AbstractC13178c.m14838l("idConfigs", "idConfigs", reader);
                }
            } else {
                reader.mo12802H0();
                reader.mo12800D();
            }
        }
    }
}

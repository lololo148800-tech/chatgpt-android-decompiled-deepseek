package com.withpersona.sdk2.inquiry.internal.network;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p342Nj.EnumC5810d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement$Companion", "Lbj/r;", "LNj/d;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)LNj/d;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;LNj/d;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquirySessionResponse$GpsCollectionRequirement$Companion extends AbstractC11471r {
    @Override // bj.AbstractC11471r
    @InterfaceC11453S
    public void toJson(AbstractC11440E writer, EnumC5810d value) {
        AbstractC16544l.m18094g(writer, "writer");
    }

    @Override // bj.AbstractC11471r
    @InterfaceC11467n
    public EnumC5810d fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        Object objM12871r0 = reader.m12871r0();
        if (AbstractC16544l.m18089b(objM12871r0, "require")) {
            return EnumC5810d.REQUIRE;
        }
        return AbstractC16544l.m18089b(objM12871r0, ParameterNames.OPTIONAL) ? EnumC5810d.OPTIONAL : EnumC5810d.NONE;
    }
}

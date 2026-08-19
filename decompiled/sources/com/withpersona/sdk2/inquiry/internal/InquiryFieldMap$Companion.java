package com.withpersona.sdk2.inquiry.internal;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17308k;
import p247Jj.AbstractC4385H;
import p247Jj.C4381F;
import p247Jj.C4387I;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"com/withpersona/sdk2/inquiry/internal/InquiryFieldMap$Companion", "Lbj/r;", "LJj/I;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)LJj/I;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;LJj/I;)V", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryFieldMap$Companion extends AbstractC11471r {
    @Override // bj.AbstractC11471r
    @InterfaceC11467n
    public C4387I fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        throw new C17308k("An operation is not implemented: Not yet implemented");
    }

    @Override // bj.AbstractC11471r
    @InterfaceC11453S
    public void toJson(AbstractC11440E writer, C4387I value) {
        AbstractC16544l.m18094g(writer, "writer");
        if (value == null) {
            writer.mo12829W();
            return;
        }
        writer.mo12833e();
        for (Map.Entry entry : value.f14256a.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC4385H abstractC4385H = (AbstractC4385H) entry.getValue();
            writer.mo12827T(str);
            if (abstractC4385H instanceof InquiryField$StringField) {
                writer.mo12828V0(((InquiryField$StringField) abstractC4385H).f40674Y);
            } else if (abstractC4385H instanceof InquiryField$IntegerField) {
                writer.mo12826N0(((InquiryField$IntegerField) abstractC4385H).f40670Y);
            } else if (abstractC4385H instanceof InquiryField$BooleanField) {
                writer.mo12825J0(((InquiryField$BooleanField) abstractC4385H).f40660Y);
            } else if (abstractC4385H instanceof InquiryField$DatetimeField) {
                writer.mo12828V0(((InquiryField$DatetimeField) abstractC4385H).f40666Y);
            } else if (abstractC4385H instanceof InquiryField$DateField) {
                writer.mo12828V0(((InquiryField$DateField) abstractC4385H).f40664Y);
            } else if (abstractC4385H instanceof InquiryField$FloatField) {
                writer.mo12826N0(((InquiryField$FloatField) abstractC4385H).f40668Y);
            } else if (abstractC4385H instanceof InquiryField$ChoicesField) {
                writer.mo12828V0(((InquiryField$ChoicesField) abstractC4385H).f40662Y);
            } else if (abstractC4385H instanceof InquiryField$MultiChoicesField) {
                writer.mo12832a();
                String[] strArr = ((InquiryField$MultiChoicesField) abstractC4385H).f40672Y;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        writer.mo12828V0(str2);
                    }
                }
                writer.mo12834m();
            } else if (abstractC4385H instanceof C4381F) {
                throw new IllegalStateException("Attempted to write field with type `Unknown`.");
            }
        }
        writer.mo12823E();
    }
}

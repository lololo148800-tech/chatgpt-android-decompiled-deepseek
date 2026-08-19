package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "toInlineInquiryBuilder", "(Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "(Lcom/withpersona/sdk2/inquiry/InquiryBuilder;)Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Landroidx/fragment/app/a;", "createFragment", "(Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;)Landroidx/fragment/app/a;", "inquiry-dynamic-feature_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryUtilsKt {
    public static final AbstractComponentCallbacksC11000a createFragment(InlineInquiryBuilder inlineInquiryBuilder) {
        AbstractC16544l.m18094g(inlineInquiryBuilder, "<this>");
        return inlineInquiryBuilder.build().createFragment();
    }

    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryTemplateBuilder inquiryTemplateBuilder) {
        AbstractC16544l.m18094g(inquiryTemplateBuilder, "<this>");
        return inquiryTemplateBuilder.build().buildInlineInquiry();
    }

    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryBuilder inquiryBuilder) {
        AbstractC16544l.m18094g(inquiryBuilder, "<this>");
        return inquiryBuilder.build().buildInlineInquiry();
    }
}

package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003H\u0007R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "", "inquiryId", "", "(Ljava/lang/String;)V", "consumeExceptions", "", "Ljava/lang/Boolean;", "locale", "routingCountry", "sessionToken", "theme", "", "Ljava/lang/Integer;", "themeSetId", "useServerStyles", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryBuilder {
    private Boolean consumeExceptions;
    private final String inquiryId;
    private String locale;
    private String routingCountry;
    private String sessionToken;
    private Integer theme;
    private String themeSetId;
    private Boolean useServerStyles;

    public InquiryBuilder(String inquiryId) {
        AbstractC16544l.m18094g(inquiryId, "inquiryId");
        this.inquiryId = inquiryId;
    }

    public final Inquiry build() {
        return new Inquiry(null, null, this.inquiryId, this.sessionToken, null, null, null, this.theme, null, null, null, null, null, this.useServerStyles, null, this.themeSetId, this.routingCountry, this.locale, this.consumeExceptions);
    }

    public final InquiryBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final InquiryBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryBuilder routingCountry(String routingCountry) {
        this.routingCountry = routingCountry;
        return this;
    }

    public final InquiryBuilder sessionToken(String sessionToken) {
        if (sessionToken != null && sessionToken.length() != 0) {
            this.sessionToken = sessionToken;
        }
        return this;
    }

    @InterfaceC17300c
    public final InquiryBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    @ExperimentalThemeSetId
    public final InquiryBuilder themeSetId(String themeSetId) {
        AbstractC16544l.m18094g(themeSetId, "themeSetId");
        this.themeSetId = themeSetId;
        return this;
    }

    public final InquiryBuilder theme(ThemeSource themeSource) {
        AbstractC16544l.m18094g(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }
}

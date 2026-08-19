package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nH\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u0012\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003H\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006!"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "", "templateId", "", "templateVersion", "staticInquiryTemplate", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "accountId", "consumeExceptions", "", "Ljava/lang/Boolean;", "enableErrorLogging", "environment", "Lcom/withpersona/sdk2/inquiry/Environment;", "environmentId", "fields", "Lcom/withpersona/sdk2/inquiry/Fields;", "locale", "referenceId", "returnCollectedData", "routingCountry", "shouldAutoFallback", "theme", "", "Ljava/lang/Integer;", "themeSetId", "useServerStyles", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "fromTemplateId", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryTemplateBuilder {
    private String accountId;
    private Boolean consumeExceptions;
    private Boolean enableErrorLogging;
    private Environment environment;
    private String environmentId;
    private Fields fields;
    private String locale;
    private String referenceId;
    private Boolean returnCollectedData;
    private String routingCountry;
    private Boolean shouldAutoFallback;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final String templateId;
    private final String templateVersion;
    private Integer theme;
    private String themeSetId;
    private Boolean useServerStyles;

    public InquiryTemplateBuilder() {
        this(null, null, null, 7, null);
    }

    public final InquiryTemplateBuilder accountId(String accountId) {
        this.referenceId = null;
        this.accountId = accountId;
        return this;
    }

    public final Inquiry build() {
        return new Inquiry(this.templateId, this.templateVersion, null, null, this.referenceId, this.accountId, this.fields, this.theme, this.environment, this.environmentId, this.enableErrorLogging, this.returnCollectedData, this.shouldAutoFallback, this.useServerStyles, this.staticInquiryTemplate, this.themeSetId, this.routingCountry, this.locale, this.consumeExceptions);
    }

    public final InquiryTemplateBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final InquiryTemplateBuilder enableErrorLogging(boolean enableErrorLogging) {
        this.enableErrorLogging = Boolean.valueOf(enableErrorLogging);
        return this;
    }

    public final InquiryTemplateBuilder environment(Environment environment) {
        AbstractC16544l.m18094g(environment, "environment");
        this.environment = environment;
        return this;
    }

    public final InquiryTemplateBuilder environmentId(String environmentId) {
        AbstractC16544l.m18094g(environmentId, "environmentId");
        this.environmentId = environmentId;
        return this;
    }

    public final InquiryTemplateBuilder fields(Fields fields) {
        this.fields = fields;
        return this;
    }

    public final InquiryTemplateBuilder fromTemplateId(String templateId) {
        AbstractC16544l.m18094g(templateId, "templateId");
        return new InquiryTemplateBuilder(templateId, null, null, 6, null);
    }

    public final InquiryTemplateBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryTemplateBuilder referenceId(String referenceId) {
        this.accountId = null;
        this.referenceId = referenceId;
        return this;
    }

    public final InquiryTemplateBuilder returnCollectedData(boolean returnCollectedData) {
        this.returnCollectedData = Boolean.valueOf(returnCollectedData);
        return this;
    }

    public final InquiryTemplateBuilder routingCountry(String routingCountry) {
        this.routingCountry = routingCountry;
        return this;
    }

    @ExperimentalFallbackMode
    public final InquiryTemplateBuilder shouldAutoFallback(boolean shouldAutoFallback) {
        this.shouldAutoFallback = Boolean.valueOf(shouldAutoFallback);
        return this;
    }

    @InterfaceC17300c
    public final InquiryTemplateBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    @ExperimentalThemeSetId
    public final InquiryTemplateBuilder themeSetId(String themeSetId) {
        AbstractC16544l.m18094g(themeSetId, "themeSetId");
        this.themeSetId = themeSetId;
        return this;
    }

    public InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate) {
        this.templateId = str;
        this.templateVersion = str2;
        this.staticInquiryTemplate = staticInquiryTemplate;
    }

    public final InquiryTemplateBuilder theme(ThemeSource themeSource) {
        AbstractC16544l.m18094g(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ServerThemeSource);
        return this;
    }

    public /* synthetic */ InquiryTemplateBuilder(String str, String str2, StaticInquiryTemplate staticInquiryTemplate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : staticInquiryTemplate);
    }
}

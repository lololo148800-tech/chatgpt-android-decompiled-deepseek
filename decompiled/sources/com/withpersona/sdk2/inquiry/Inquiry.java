package com.withpersona.sdk2.inquiry;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.sentry.instrumentation.file.C15378c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p022Ak.C0540a;
import p022Ak.EnumC0543d;
import p025An.C0644w;
import p1109xj.C21277a;
import p247Jj.AbstractC4385H;
import p247Jj.C4381F;
import p247Jj.C4389J;
import p247Jj.EnumC4410U;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8119j5;
import p544W9.AbstractC8746y3;
import p859l.AbstractC16651b;
import p909nm.AbstractC17660E;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 62\u00020\u0001:\u000267BÇ\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104¨\u00068"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry;", "", "", "templateId", "templateVersion", "inquiryId", "sessionToken", "referenceId", "accountId", "Lcom/withpersona/sdk2/inquiry/Fields;", "fields", "", "theme", "Lcom/withpersona/sdk2/inquiry/Environment;", "environment", "environmentId", "", "enableErrorLogging", "returnCollectedData", "shouldAutoFallback", "useServerStyles", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "themeSetId", "routingCountry", "locale", "consumeExceptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "toInquiryActivityIntent", "(Landroid/content/Context;)Landroid/content/Intent;", "Landroid/app/Activity;", "activity", "requestCode", "Lmm/C;", "start", "(Landroid/app/Activity;I)V", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "buildInlineInquiry", "()Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Landroid/os/Bundle;", "bundle", "addArgumentsToBundle$inquiry_dynamic_feature_release", "(Landroid/os/Bundle;)V", "addArgumentsToBundle", "Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/Fields;", "Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/Environment;", "Ljava/lang/Boolean;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "Companion", "Contract", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Inquiry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final Boolean consumeExceptions;
    private final Boolean enableErrorLogging;
    private final Environment environment;
    private final String environmentId;
    private final Fields fields;
    private final String inquiryId;
    private final String locale;
    private final String referenceId;
    private final Boolean returnCollectedData;
    private final String routingCountry;
    private final String sessionToken;
    private final Boolean shouldAutoFallback;
    private final StaticInquiryTemplate staticInquiryTemplate;
    private final String templateId;
    private final String templateVersion;
    private final Integer theme;
    private final String themeSetId;
    private final Boolean useServerStyles;

    @Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020!¢\u0006\u0004\b#\u0010\u0003¨\u0006$"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroid/content/Context;", "context", "LJj/U;", "getStatus", "(Landroid/os/Bundle;Landroid/content/Context;)LJj/U;", "", "templateId", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "fromTemplate", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "templateVersion", "fromTemplateVersion", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "fromStaticTemplate", "(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "inquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "fromInquiry", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "Landroid/content/Intent;", "intent", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "onActivityResult", "(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "bundle", "extractInquiryResponseFromBundle", "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "Lmm/C;", "prefetchModels", "cancelRunningInquiries", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {

        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC4410U.values().length];
                try {
                    EnumC4410U enumC4410U = EnumC4410U.f14309Y;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    EnumC4410U enumC4410U2 = EnumC4410U.f14309Y;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    EnumC4410U enumC4410U3 = EnumC4410U.f14309Y;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final EnumC4410U getStatus(Bundle bundle, Context context) {
            String string;
            EnumC4410U enumC4410UValueOf = null;
            if (bundle != null && (string = bundle.getString("PERSONA_ACTIVITY_RESULT")) != null) {
                try {
                    enumC4410UValueOf = EnumC4410U.valueOf(string);
                } catch (Exception unused) {
                }
            }
            if (enumC4410UValueOf != null) {
                return enumC4410UValueOf;
            }
            if (context == null) {
                return EnumC4410U.f14309Y;
            }
            return new File(new C21277a(context).f67671a, "last_error.txt").exists() ? EnumC4410U.f14310Z : EnumC4410U.f14309Y;
        }

        public static /* synthetic */ InquiryResponse onActivityResult$default(Companion companion, Intent intent, Context context, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                context = null;
            }
            return companion.onActivityResult(intent, context);
        }

        public final void cancelRunningInquiries() {
            InquiryActivityBroadcastManager.INSTANCE.cancelRunningInquiries();
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0080  */
        public final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
            C4389J c4389j;
            Object unknownField;
            Object dateField;
            String str;
            EnumC0543d enumC0543d;
            EnumC0543d enumC0543d2;
            EnumC4410U status = getStatus(bundle, context);
            String string = bundle != null ? bundle.getString("INQUIRY_ID_KEY") : null;
            int iOrdinal = status.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return new InquiryResponse.Cancel(string, bundle != null ? bundle.getString("SESSION_TOKEN_KEY") : null);
                }
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                String string2 = bundle != null ? bundle.getString("ERROR_DEBUG_MESSAGE_KEY") : null;
                if (context != null) {
                    File file = new File(new C21277a(context).f67671a, "last_error.txt");
                    if (file.exists() && file.isFile()) {
                        byte[] bArr = new byte[8192];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        C15378c c15378cM9492c = AbstractC8746y3.m9492c(file, new FileInputStream(file));
                        while (true) {
                            try {
                                int i10 = c15378cM9492c.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    AbstractC7942M5.m8232a(c15378cM9492c, th2);
                                    throw th3;
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC16544l.m18093f(byteArray, "toByteArray(...)");
                        Charset UTF_8 = C21277a.f67670b;
                        AbstractC16544l.m18093f(UTF_8, "UTF_8");
                        str = new String(byteArray, UTF_8);
                        AbstractC7942M5.m8232a(c15378cM9492c, null);
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (bundle != null) {
                    try {
                        enumC0543d = (EnumC0543d) bundle.getParcelable("ERROR_CODE_KEY");
                    } catch (Exception unused) {
                        enumC0543d2 = EnumC0543d.f1729t0;
                    }
                } else {
                    enumC0543d = null;
                }
                enumC0543d2 = enumC0543d instanceof EnumC0543d ? enumC0543d : null;
                if (enumC0543d2 == null) {
                    enumC0543d2 = EnumC0543d.f1729t0;
                }
                if (string2 == null) {
                    string2 = "An otherwise unexpected error occurred.";
                }
                return new InquiryResponse.Error(string2, enumC0543d2, str);
            }
            if (bundle == null || (c4389j = (C4389J) AbstractC8119j5.m8621b(bundle, "FIELDS_MAP_KEY", C4389J.class)) == null) {
                c4389j = new C4389J(C17690x.f56481Y);
            }
            String string3 = bundle != null ? bundle.getString("INQUIRY_STATUS_KEY") : null;
            C0540a c0540a = bundle != null ? (C0540a) AbstractC8119j5.m8621b(bundle, "COLLECTED_DATA", C0540a.class) : null;
            AbstractC16544l.m18091d(string);
            AbstractC16544l.m18091d(string3);
            Map map = c4389j.f14258Y;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                AbstractC4385H abstractC4385H = (AbstractC4385H) entry.getValue();
                if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$StringField) {
                    unknownField = new InquiryField.StringField(((com.withpersona.sdk2.inquiry.internal.InquiryField$StringField) abstractC4385H).f40674Y);
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$IntegerField) {
                    unknownField = new InquiryField.IntegerField(((com.withpersona.sdk2.inquiry.internal.InquiryField$IntegerField) abstractC4385H).f40670Y);
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$BooleanField) {
                    unknownField = new InquiryField.BooleanField(((com.withpersona.sdk2.inquiry.internal.InquiryField$BooleanField) abstractC4385H).f40660Y);
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$FloatField) {
                    unknownField = new InquiryField.FloatField(((com.withpersona.sdk2.inquiry.internal.InquiryField$FloatField) abstractC4385H).f40668Y);
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$DateField) {
                    String str2 = ((com.withpersona.sdk2.inquiry.internal.InquiryField$DateField) abstractC4385H).f40664Y;
                    if (str2 != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str2));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DateField(null);
                    }
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$DatetimeField) {
                    String str3 = ((com.withpersona.sdk2.inquiry.internal.InquiryField$DatetimeField) abstractC4385H).f40666Y;
                    if (str3 != null) {
                        dateField = new InquiryField.DateField(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(str3));
                        unknownField = dateField;
                    } else {
                        unknownField = new InquiryField.DatetimeField(null);
                    }
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$ChoicesField) {
                    unknownField = new InquiryField.ChoicesField(((com.withpersona.sdk2.inquiry.internal.InquiryField$ChoicesField) abstractC4385H).f40662Y);
                } else if (abstractC4385H instanceof com.withpersona.sdk2.inquiry.internal.InquiryField$MultiChoicesField) {
                    unknownField = new InquiryField.MultiChoicesField(((com.withpersona.sdk2.inquiry.internal.InquiryField$MultiChoicesField) abstractC4385H).f40672Y);
                } else {
                    if (!(abstractC4385H instanceof C4381F)) {
                        throw new C0644w();
                    }
                    unknownField = new InquiryField.UnknownField(((C4381F) abstractC4385H).f14249Y);
                }
                linkedHashMap.put(key, unknownField);
            }
            return new InquiryResponse.Complete(string, string3, linkedHashMap, c0540a);
        }

        public final InquiryBuilder fromInquiry(String inquiryId) {
            AbstractC16544l.m18094g(inquiryId, "inquiryId");
            return new InquiryBuilder(inquiryId);
        }

        public final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
            AbstractC16544l.m18094g(staticInquiryTemplate, "staticInquiryTemplate");
            return new InquiryTemplateBuilder(null, null, staticInquiryTemplate, 3, null);
        }

        public final InquiryTemplateBuilder fromTemplate(String templateId) {
            AbstractC16544l.m18094g(templateId, "templateId");
            return new InquiryTemplateBuilder(templateId, null, null, 6, null);
        }

        public final InquiryTemplateBuilder fromTemplateVersion(String templateVersion) {
            AbstractC16544l.m18094g(templateVersion, "templateVersion");
            return new InquiryTemplateBuilder(null, templateVersion, null, 5, null);
        }

        @InterfaceC17300c
        public final InquiryResponse onActivityResult(Intent intent) {
            return onActivityResult$default(this, intent, null, 2, null);
        }

        public final void prefetchModels() {
            try {
                AbstractC16544l.m18092e(Class.forName("com.withpersona.sdk2.inquiry.extraction.impl.TextEntityExtractorImpl").newInstance(), "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.types.ModelBackedExtractor");
                throw new ClassCastException();
            } catch (ClassNotFoundException unused) {
            }
        }

        private Companion() {
        }

        @InterfaceC17300c
        public final InquiryResponse onActivityResult(Intent intent, Context context) {
            return extractInquiryResponseFromBundle(intent != null ? intent.getExtras() : null, context);
        }
    }

    @Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;", "Ll/b;", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "<init>", "()V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/Inquiry;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;", "Landroid/content/Context;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static class Contract extends AbstractC16651b {
        private Context context;

        @InterfaceC17300c
        public Contract() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Contract(Context context) {
            this();
            AbstractC16544l.m18094g(context, "context");
            this.context = context;
        }

        @Override // p859l.AbstractC16651b
        public Intent createIntent(Context context, Inquiry input) {
            AbstractC16544l.m18094g(context, "context");
            AbstractC16544l.m18094g(input, "input");
            return input.toInquiryActivityIntent(context);
        }

        @Override // p859l.AbstractC16651b
        public InquiryResponse parseResult(int resultCode, Intent intent) {
            return Inquiry.INSTANCE.onActivityResult(intent, this.context);
        }
    }

    public Inquiry(String str, String str2, String str3, String str4, String str5, String str6, Fields fields, Integer num, Environment environment, String str7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, StaticInquiryTemplate staticInquiryTemplate, String str8, String str9, String str10, Boolean bool5) {
        this.templateId = str;
        this.templateVersion = str2;
        this.inquiryId = str3;
        this.sessionToken = str4;
        this.referenceId = str5;
        this.accountId = str6;
        this.fields = fields;
        this.theme = num;
        this.environment = environment;
        this.environmentId = str7;
        this.enableErrorLogging = bool;
        this.returnCollectedData = bool2;
        this.shouldAutoFallback = bool3;
        this.useServerStyles = bool4;
        this.staticInquiryTemplate = staticInquiryTemplate;
        this.themeSetId = str8;
        this.routingCountry = str9;
        this.locale = str10;
        this.consumeExceptions = bool5;
    }

    public static final InquiryResponse extractInquiryResponseFromBundle(Bundle bundle, Context context) {
        return INSTANCE.extractInquiryResponseFromBundle(bundle, context);
    }

    public static final InquiryBuilder fromInquiry(String str) {
        return INSTANCE.fromInquiry(str);
    }

    public static final InquiryTemplateBuilder fromStaticTemplate(StaticInquiryTemplate staticInquiryTemplate) {
        return INSTANCE.fromStaticTemplate(staticInquiryTemplate);
    }

    public static final InquiryTemplateBuilder fromTemplate(String str) {
        return INSTANCE.fromTemplate(str);
    }

    public static final InquiryTemplateBuilder fromTemplateVersion(String str) {
        return INSTANCE.fromTemplateVersion(str);
    }

    @InterfaceC17300c
    public static final InquiryResponse onActivityResult(Intent intent) {
        return INSTANCE.onActivityResult(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent toInquiryActivityIntent(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.withpersona.sdk2.inquiry.internal.InquiryActivity");
        Bundle bundle = new Bundle();
        addArgumentsToBundle$inquiry_dynamic_feature_release(bundle);
        intent.replaceExtras(bundle);
        return intent;
    }

    public final void addArgumentsToBundle$inquiry_dynamic_feature_release(Bundle bundle) {
        AbstractC16544l.m18094g(bundle, "bundle");
        String str = this.templateId;
        if (str != null) {
            bundle.putString("TEMPLATE_ID_KEY", str);
        }
        String str2 = this.templateVersion;
        if (str2 != null) {
            bundle.putString("TEMPLATE_VERSION_KEY", str2);
        }
        String str3 = this.inquiryId;
        if (str3 != null) {
            bundle.putString("INQUIRY_ID_KEY", str3);
        }
        String str4 = this.sessionToken;
        if (str4 != null) {
            bundle.putString("SESSION_TOKEN_KEY", str4);
        }
        String str5 = this.referenceId;
        if (str5 != null) {
            bundle.putString("REFERENCE_ID_KEY", str5);
        }
        String str6 = this.accountId;
        if (str6 != null) {
            bundle.putString("ACCOUNT_ID_KEY", str6);
        }
        Fields fields = this.fields;
        if (fields != null) {
            bundle.putParcelable("FIELDS_MAP_KEY", new C4389J(fields.getFields$inquiry_dynamic_feature_release()));
        }
        Integer num = this.theme;
        if (num != null) {
            bundle.putInt("THEME_KEY", num.intValue());
        }
        StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
        if (staticInquiryTemplate != null) {
            bundle.putParcelable("STATIC_INQUIRY_TEMPLATE_KEY", staticInquiryTemplate);
        }
        Environment environment = this.environment;
        if (environment != null) {
            bundle.putString("ENVIRONMENT_KEY", environment.name());
        }
        String str7 = this.environmentId;
        if (str7 != null) {
            bundle.putString("ENVIRONMENT_ID_KEY", str7);
        }
        Boolean bool = this.enableErrorLogging;
        if (bool != null) {
            bundle.putBoolean("ENABLE_ERROR_LOGGING", bool.booleanValue());
        }
        Boolean bool2 = this.returnCollectedData;
        if (bool2 != null) {
            bundle.putBoolean("RETURN_COLLECTED_DATA", bool2.booleanValue());
        }
        Boolean bool3 = this.shouldAutoFallback;
        if (bool3 != null) {
            bundle.putBoolean("SHOULD_AUTO_FALLBACK", bool3.booleanValue());
        }
        Boolean bool4 = this.useServerStyles;
        if (bool4 != null) {
            bundle.putBoolean("USE_SERVER_STYLES", bool4.booleanValue());
        }
        String str8 = this.themeSetId;
        if (str8 != null) {
            bundle.putString("THEME_SET_ID_KEY", str8);
        }
        String str9 = this.routingCountry;
        if (str9 != null) {
            bundle.putString("ROUTING_COUNTRY", str9);
        }
        String str10 = this.locale;
        if (str10 != null) {
            bundle.putString("LOCALE", str10);
        }
        Boolean bool5 = this.consumeExceptions;
        if (bool5 != null) {
            bundle.putBoolean("CONSUME_EXCEPTIONS", bool5.booleanValue());
        }
    }

    public final InlineInquiryBuilder buildInlineInquiry() {
        return new InlineInquiryBuilder(this);
    }

    @InterfaceC17300c
    public final void start(Activity activity, int requestCode) {
        AbstractC16544l.m18094g(activity, "activity");
        activity.startActivityForResult(toInquiryActivityIntent(activity), requestCode);
    }

    @InterfaceC17300c
    public static final InquiryResponse onActivityResult(Intent intent, Context context) {
        return INSTANCE.onActivityResult(intent, context);
    }
}

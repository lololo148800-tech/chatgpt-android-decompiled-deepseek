package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Document_ConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Config;)V", "Lbj/v;", "options", "Lbj/v;", "", "nullableBooleanAdapter", "Lbj/r;", "", "intAdapter", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$StartPage;", "startPageAdapter", "stringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "nullablePagesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "nullableAssetConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "nullablePendingPageTextPositionAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Document_ConfigJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r intAdapter;
    private final AbstractC11471r localizationsAdapter;
    private final AbstractC11471r nullableAssetConfigAdapter;
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullablePagesAdapter;
    private final AbstractC11471r nullablePendingPageTextPositionAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("backStepEnabled", "cancelButtonEnabled", "documentFileLimit", "documentId", "startPage", "fieldKeyDocument", "kind", "localizations", "pages", "assets", "pendingPageTextVerticalPosition");
    private final AbstractC11471r startPageAdapter;
    private final AbstractC11471r stringAdapter;

    public NextStep_Document_ConfigJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "backStepEnabled");
        this.intAdapter = c11447l.m12850b(Integer.TYPE, c17691y, "documentFileLimit");
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "documentId");
        this.startPageAdapter = c11447l.m12850b(NextStep.Document.StartPage.class, c17691y, "startPage");
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "fieldKeyDocument");
        this.localizationsAdapter = c11447l.m12850b(NextStep.Document.Localizations.class, c17691y, "localizations");
        this.nullablePagesAdapter = c11447l.m12850b(NextStep.Document.Pages.class, c17691y, "pages");
        this.nullableAssetConfigAdapter = c11447l.m12850b(NextStep.Document.AssetConfig.class, c17691y, "assets");
        this.nullablePendingPageTextPositionAdapter = c11447l.m12850b(PendingPageTextPosition.class, c17691y, "pendingPageTextVerticalPosition");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(46, "GeneratedJsonAdapter(NextStep.Document.Config)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.Document.Config fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        NextStep.Document.StartPage startPage = null;
        String str2 = null;
        String str3 = null;
        NextStep.Document.Localizations localizations = null;
        NextStep.Document.Pages pages = null;
        NextStep.Document.AssetConfig assetConfig = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        while (true) {
            PendingPageTextPosition pendingPageTextPosition2 = pendingPageTextPosition;
            NextStep.Document.AssetConfig assetConfig2 = assetConfig;
            NextStep.Document.Pages pages2 = pages;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (num == null) {
                    throw AbstractC13178c.m14832f("documentFileLimit", "documentFileLimit", reader);
                }
                int iIntValue = num.intValue();
                if (startPage == null) {
                    throw AbstractC13178c.m14832f("startPage", "startPage", reader);
                }
                if (str2 == null) {
                    throw AbstractC13178c.m14832f("fieldKeyDocument", "fieldKeyDocument", reader);
                }
                if (str3 == null) {
                    throw AbstractC13178c.m14832f("kind", "kind", reader);
                }
                if (localizations != null) {
                    return new NextStep.Document.Config(bool, bool2, iIntValue, str, startPage, str2, str3, localizations, pages2, assetConfig2, pendingPageTextPosition2);
                }
                throw AbstractC13178c.m14832f("localizations", "localizations", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 0:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 2:
                    num = (Integer) this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw AbstractC13178c.m14838l("documentFileLimit", "documentFileLimit", reader);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 3:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 4:
                    startPage = (NextStep.Document.StartPage) this.startPageAdapter.fromJson(reader);
                    if (startPage == null) {
                        throw AbstractC13178c.m14838l("startPage", "startPage", reader);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("fieldKeyDocument", "fieldKeyDocument", reader);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 6:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC13178c.m14838l("kind", "kind", reader);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 7:
                    localizations = (NextStep.Document.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations == null) {
                        throw AbstractC13178c.m14838l("localizations", "localizations", reader);
                    }
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                case 8:
                    pages = (NextStep.Document.Pages) this.nullablePagesAdapter.fromJson(reader);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    break;
                case 9:
                    assetConfig = (NextStep.Document.AssetConfig) this.nullableAssetConfigAdapter.fromJson(reader);
                    pendingPageTextPosition = pendingPageTextPosition2;
                    pages = pages2;
                    break;
                case 10:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
                default:
                    pendingPageTextPosition = pendingPageTextPosition2;
                    assetConfig = assetConfig2;
                    pages = pages2;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.Document.Config value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.mo12827T("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.mo12827T("documentFileLimit");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDocumentFileLimit()));
        writer.mo12827T("documentId");
        this.nullableStringAdapter.toJson(writer, value_.getDocumentId());
        writer.mo12827T("startPage");
        this.startPageAdapter.toJson(writer, value_.getStartPage());
        writer.mo12827T("fieldKeyDocument");
        this.stringAdapter.toJson(writer, value_.getFieldKeyDocument());
        writer.mo12827T("kind");
        this.stringAdapter.toJson(writer, value_.getKind());
        writer.mo12827T("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.mo12827T("pages");
        this.nullablePagesAdapter.toJson(writer, value_.getPages());
        writer.mo12827T("assets");
        this.nullableAssetConfigAdapter.toJson(writer, value_.getAssets());
        writer.mo12827T("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.mo12823E();
    }
}

package org.example.shoppingmall.dto.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@Data
public class ProductUpdateDto {
    private String productId;                // ��ǰ ID
    private String productName;              // ��ǰ �̸�
    private Double productPrice;             // ��ǰ ����
    private String productDescription;       // ��ǰ ����
    private String productCategoryId;        // ī�װ� ID
    private String productSessionId;         // ���� ID
    private String productNotes;             // ���
    private String productGender;            // ����
    private String productFit;               // ��
    private String productTexture;           // �˰�
    private String productThickness;         // �β�
    private String productManufacturer;      // ������
    private String productOrigin;            // ������
    private String productQualityAssuranceStandard;  // ǰ�� ���� ����
    private List<String> detailColor;        // ����
    private List<String> detailSize;         // ������
    private List<String> colors;        // ����
    private List<String> sizes;         // ������

    // �߰��� ���� ���ε带 ���� �ʵ�
    private String imageFile;                // �̹��� ���� (���õ� ���� ��� �Ǵ� ���ϸ� ��)

}
